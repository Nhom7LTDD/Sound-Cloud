package com.bin.soundcloud;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;

public class item_song extends AppCompatActivity {

    AppBarLayout appbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        final android.support.v7.widget.Toolbar toolbar;
        super.onCreate(savedInstanceState);

        setContentView(R.layout.item_song_layout);
        appbar=findViewById(R.id.appbar);


        toolbar=  findViewById(R.id.toolbaritemsong);
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        getIncomingIntent();


    }
    private  void getIncomingIntent(){
        if(getIntent().hasExtra("anhbaihatitemsong") && getIntent().hasExtra("tencasi")&& getIntent().hasExtra("tenaihat")){
            String imageUrl=getIntent().getStringExtra("anhbaihatitemsong");
            String tencasiUrl=getIntent().getStringExtra("tencasi");
            String tenaihatUrl=getIntent().getStringExtra("tenaihat");


            setImage(imageUrl,tencasiUrl,tenaihatUrl);
        }

    }
    public void setImage(String imageurl,String tencasi,String tenbaihat){
        ImageView image=findViewById(R.id.anhbaihatitemsong);
        Glide.with(this)
                .asBitmap()
                .load(imageurl)
                .into(image);
        TextView txttencasi=findViewById(R.id.tencasiitemsong);
        txttencasi.setText(tencasi);
        TextView txttenbaihat=findViewById(R.id.tenbaihatitemsong);
        txttenbaihat.setText(tenbaihat);

    }
}
