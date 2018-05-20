package com.bin.soundcloud;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.bin.soundcloud.Adapter.RecycleViewAdapter_ListsongVertical;
import com.bin.soundcloud.Data.SingleItemRecycleView_Vertical;

import java.util.ArrayList;
import java.util.List;



public class listsong_vertical extends AppCompatActivity {
Toolbar toolbar;
    private RecyclerView myrecycleview;
    private List<SingleItemRecycleView_Vertical> listsongvertical;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_listsong);

        toolbar=  findViewById(R.id.toolbarcontent);
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null)
            getSupportActionBar().setTitle("");

        myrecycleview=  findViewById(R.id.listvetical);
        RecycleViewAdapter_ListsongVertical recycleViewAdapter_listsongVertical=new RecycleViewAdapter_ListsongVertical(this,listsongvertical);
        myrecycleview.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        myrecycleview.setAdapter(recycleViewAdapter_listsongVertical);





        listsongvertical=new ArrayList<>();
        listsongvertical.add(new SingleItemRecycleView_Vertical("https://photos.google.com/search/_tra_/photo/AF1QipMiot7V36wCdIIHl1LhlydgTHR1l_gERrwzmSTg?hl=vi","MrSuicideSheep","Wafia-Let Me Love You(prod.Thrupence)","4,01M","3:14"));
        listsongvertical.add(new SingleItemRecycleView_Vertical("https://photos.google.com/search/_tra_/photo/AF1QipMiot7V36wCdIIHl1LhlydgTHR1l_gERrwzmSTg?hl=vi","Franne","NoNoNo-Pumpin'sBlood(Franne Edit)","4,6M","5:58"));
        listsongvertical.add(new SingleItemRecycleView_Vertical("https://photos.google.com/search/_tra_/photo/AF1QipMiot7V36wCdIIHl1LhlydgTHR1l_gERrwzmSTg?hl=vi","Madison","SoMo-How Deep Is Your Love(Calvin Harris/Disciples Rendition","733K","3:36"));
        listsongvertical.add(new SingleItemRecycleView_Vertical("https://photos.google.com/search/_tra_/photo/AF1QipMiot7V36wCdIIHl1LhlydgTHR1l_gERrwzmSTg?hl=vi","tarro","blackbear-Idfc(tarro Remix)","26,1M","4:08"));
        listsongvertical.add(new SingleItemRecycleView_Vertical("https://photos.google.com/search/_tra_/photo/AF1QipMiot7V36wCdIIHl1LhlydgTHR1l_gERrwzmSTg?hl=vi","theneighbourhood","Sweater Weather","5,53M","4:00"));
        listsongvertical.add(new SingleItemRecycleView_Vertical("https://photos.google.com/search/_tra_/photo/AF1QipMiot7V36wCdIIHl1LhlydgTHR1l_gERrwzmSTg?hl=vi","thestox","Mirror-Kat Dahlia-Produced by The Stox","292K","4:17"));
        listsongvertical.add(new SingleItemRecycleView_Vertical("https://photos.google.com/search/_tra_/photo/AF1QipMiot7V36wCdIIHl1LhlydgTHR1l_gERrwzmSTg?hl=vi","Raymony","Passenger-Let Her Go(Raymony Trap Remix)","790K",",4:12"));
        listsongvertical.add(new SingleItemRecycleView_Vertical("https://photos.google.com/search/_tra_/photo/AF1QipMiot7V36wCdIIHl1LhlydgTHR1l_gERrwzmSTg?hl=vi","Da Hofnar","Macklemore ft.Ed Sheeran- Same Love(De Hofnar Bootleg)","8,93M","4:47"));

    }

}
