package com.bin.soundcloud;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import dyanamitechetan.vusikview.VusikView;

public class item_song extends AppCompatActivity implements MediaPlayer.OnBufferingUpdateListener,MediaPlayer.OnCompletionListener {
    private ImageButton btn_play_pause;
    private SeekBar seekBar;
    private TextView textView;
    private TextView textView1;
    private boolean ongoingCall = false;
    private VusikView musicView;
    private TelephonyManager telephonyManager;
    private MediaPlayer mediaPlayer;
    private int mediaFileLength;
    private int resumePosition;
    private int realtimeLength;

    boolean serviceBound = false;
    final Handler handler = new Handler();
    AppBarLayout appbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        final android.support.v7.widget.Toolbar toolbar;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_song_layout);

        getIncomingIntent();

        // lay bai hat
        Intent intent = getIntent();
        final String urlbaihat = intent.getStringExtra("urlbaihat");

        musicView = findViewById(R.id.musikview);


        seekBar = (SeekBar) findViewById(R.id.seekbar);
        seekBar.setMax(99); // 100% (0~99)
        seekBar.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (mediaPlayer.isPlaying()) {
                    SeekBar seekBar = (SeekBar) v;
                    int playPosition = (mediaFileLength / 100) * seekBar.getProgress();
                    mediaPlayer.seekTo(playPosition);
                }
                return false;
            }
        });


        textView = (TextView) findViewById(R.id.times);
        textView1 = (TextView) findViewById(R.id.timess);
        btn_play_pause = (ImageButton) findViewById(R.id.audioStreamBtn);


        btn_play_pause.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                final ProgressDialog mDialog = new ProgressDialog(item_song.this);

                AsyncTask<String, String, String> mp3Play = new AsyncTask<String, String, String>() {

                    @Override
                    protected void onPreExecute() {
                        mDialog.setMessage("Loading");
                        mDialog.show();

                    }

                    @Override
                    protected String doInBackground(String... params) {
                        try {
                            mediaPlayer.setDataSource(params[0]);
                            mediaPlayer.prepare();
                        } catch (Exception ex) {

                        }
                        return "";
                    }

                    @Override
                    protected void onPostExecute(String s) {

                        mediaFileLength = (mediaPlayer.getDuration());
                         realtimeLength = mediaFileLength;

                        if (!mediaPlayer.isPlaying()) {

                            mediaPlayer.start();
                            btn_play_pause.setImageResource(R.drawable.ic_pauseblack24dp);

                        }
                        else {
                            mediaPlayer.pause();
                            btn_play_pause.setImageResource(R.drawable.ic_playarrowblack24dp);
                        }

                        getincomingcall();
                        updateSeekBar();
                        Settimetotal();
                        UpdateTimeSong();
                        mDialog.dismiss();
                    }
                };

                mp3Play.execute(urlbaihat); // truyen bai hat vao

                musicView.start();
            }

        });

        mediaPlayer = new MediaPlayer();

        mediaPlayer.setOnBufferingUpdateListener(this);
        mediaPlayer.setOnCompletionListener(this);


        appbar = findViewById(R.id.appbar);
        toolbar = findViewById(R.id.toolbaritemsong);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    private void getincomingcall(){
        telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        //Starting listening for PhoneState changes
       PhoneStateListener phoneStateListener = new PhoneStateListener() {
            @Override
            public void onCallStateChanged(int state, String incomingNumber) {
                switch (state) {
                    //if at least one call exists or the phone is ringing
                    //pause the MediaPlayer
                    case TelephonyManager.CALL_STATE_OFFHOOK:
                    case TelephonyManager.CALL_STATE_RINGING:
                        if (mediaPlayer != null) {
                            if (mediaPlayer.isPlaying()) {
                                mediaPlayer.pause();
                                resumePosition = mediaPlayer.getCurrentPosition();
                                btn_play_pause.setImageResource(R.drawable.ic_playarrowblack24dp);
                            }
                            ongoingCall = true;
                        }
                        break;
                    case TelephonyManager.CALL_STATE_IDLE:
                        // Phone idle. Start playing.
                        if (mediaPlayer != null) {
                            if (ongoingCall) {
                                ongoingCall = false;
                                if (!mediaPlayer.isPlaying()) {
                                    mediaPlayer.seekTo(resumePosition);
                                    mediaPlayer.start();
                                    btn_play_pause.setImageResource(R.drawable.ic_pauseblack24dp);
                                }
                            }
                        }
                        break;
                }
            }
        };
        // Register the listener with the telephony manager
        // Listen for changes to the device call state.
        telephonyManager.listen(phoneStateListener,
                PhoneStateListener.LISTEN_CALL_STATE);
    }

    private void Settimetotal() {
        SimpleDateFormat dinggianggio = new SimpleDateFormat("mm:ss");
        textView.setText(dinggianggio.format(mediaPlayer.getDuration()));
    }

    private void UpdateTimeSong() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SimpleDateFormat dinhdanggio = new SimpleDateFormat("mm:ss");
                textView1.setText(dinhdanggio.format(mediaPlayer.getCurrentPosition()));
                handler.postDelayed(this, 500);
            }
        }, 100);

    }

    private void updateSeekBar() {
        seekBar.setProgress((int) (((float) mediaPlayer.getCurrentPosition() / mediaFileLength) * 100));
        if (mediaPlayer.isPlaying()) {
            Runnable updater = new Runnable() {
                @Override
                public void run() {
                    updateSeekBar();

                    // textView.setText(String.format("%d:%d",TimeUnit.MILLISECONDS.toMinutes(realtimeLength),
                    //  TimeUnit.MILLISECONDS.toSeconds(realtimeLength) -
                    //         TimeUnit.MILLISECONDS.toSeconds(TimeUnit.MILLISECONDS.toMinutes(realtimeLength))));

                }

            };
            handler.postDelayed(updater, 1000); // 1 second
        }
    }

    @Override
    public void onBufferingUpdate(MediaPlayer mp, int percent) {
        seekBar.setSecondaryProgress(percent);
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        btn_play_pause.setImageResource(R.drawable.ic_playarrowblack24dp);
        musicView.stopNotesFall();

    }

    private void getIncomingIntent() {
        if (getIntent().hasExtra("anhbaihatitemsong") && getIntent().hasExtra("tencasi") && getIntent().hasExtra("tenaihat")) {
            String imageUrl = getIntent().getStringExtra("anhbaihatitemsong");
            String tencasiUrl = getIntent().getStringExtra("tencasi");
            String tenaihatUrl = getIntent().getStringExtra("tenaihat");

            setImage(imageUrl, tencasiUrl, tenaihatUrl);
        }


    }


    public void setImage(String imageurl, String tencasi, String tenbaihat) {
        ImageView image = findViewById(R.id.anhbaihatitemsong);
        Glide.with(this)
                .asBitmap()
                .load(imageurl)
                .into(image);
        TextView txttencasi = findViewById(R.id.tencasiitemsong);
        txttencasi.setText(tencasi);
        TextView txttenbaihat = findViewById(R.id.tenbaihatitemsong);
        txttenbaihat.setText(tenbaihat);


    }


}


