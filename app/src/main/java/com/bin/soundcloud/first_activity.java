package com.bin.soundcloud;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class first_activity extends AppCompatActivity {

    static int splash_time_out=3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        new Handler().postDelayed(new  Runnable(){
            @Override
            public void run(){
                Intent homeIntent= new Intent(first_activity.this, home.class);
                startActivity(homeIntent);
                finish();
            }
        }, splash_time_out);




    }
}
