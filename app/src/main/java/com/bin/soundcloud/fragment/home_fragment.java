package com.bin.soundcloud.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bin.soundcloud.Adapter.RecycleviewAdapter_1;
import com.bin.soundcloud.Data.SingleItemRecycleview;
import com.bin.soundcloud.R;

import java.util.ArrayList;
import java.util.List;

public class home_fragment extends android.support.v4.app.Fragment {
    View v;

    private RecyclerView myrecycleview;
    private RecyclerView myrecycleview1;
    private RecyclerView myrecycleview2;
    private RecyclerView myrecycleview3;
    private RecyclerView myrecycleview4;
    private List<SingleItemRecycleview> listbaihat;
    private List<SingleItemRecycleview> listbaihat1;
    private List<SingleItemRecycleview> listbaihat2;
    private List<SingleItemRecycleview> listbaihat3;
    private List<SingleItemRecycleview> listbaihat4;

    public home_fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.home_fragment, container, false);
        //
        myrecycleview= v.findViewById(R.id.Moreofwhatyoulike);
        RecycleviewAdapter_1 recycleviewAdapter1=new RecycleviewAdapter_1(getContext(),listbaihat);
        myrecycleview.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false ));
        myrecycleview.setAdapter(recycleviewAdapter1);
        //
        myrecycleview1= v.findViewById(R.id.Chill);
        RecycleviewAdapter_1 recycleviewAdapter2=new RecycleviewAdapter_1(getContext(),listbaihat1);
        myrecycleview1.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false ));
        myrecycleview1.setAdapter(recycleviewAdapter2);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listbaihat=new ArrayList<>();
        listbaihat.add(new SingleItemRecycleview("https://topthuthuat.com/wp/wp-content/uploads/2017/07/9.jpg","Related Tracks","In My Head"));
        listbaihat.add(new SingleItemRecycleview("http://1.bp.blogspot.com/-TRXCSsi-9z8/UzBIruZF6_I/AAAAAAAAddE/IyXQgJbZXXQ/s1600/hinh-nen-dep-HD-ve-thien-nhien-1.jpg","Related- Tracks","Wafia-Let Me Love Y.."));
        listbaihat.add(new SingleItemRecycleview("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9y6UUHABFzJIZgqzmhQjMJpE7OdLdm3DhcOcpcIDJTEGoD1tN","Related- Tracks","Sunday music ann ho.."));
        listbaihat.add(new SingleItemRecycleview("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMWSuUix-omWV9c6rwUUDlOmxhaSgRCdu8op5AdgKt5NJonntC","Related- Tracks","Summer 2k17"));
        //
        listbaihat1=new ArrayList<>();
        listbaihat1.add(new SingleItemRecycleview("http://9mobi.vn/cf/images/2015/03/nkk/nhung-hinh-anh-dep-1.jpg","Lordafj","Acid Jazz"));
        listbaihat1.add(new SingleItemRecycleview("http://taimienphi.vn/tmp/cf/aut/nhung-hinh-anh-dep-2.jpg","dalalmg","Night Cruises"));
        listbaihat1.add(new SingleItemRecycleview("http://i.9mobi.vn/cf/images/2015/03/nkk/nhung-hinh-anh-dep-3.jpg","Dealer de Musicque","Gentle Dreams"));
        listbaihat1.add(new SingleItemRecycleview("http://i.9mobi.vn/cf/images/2015/03/nkk/nhung-hinh-anh-dep-6.jpg","Omar Khlif","Sunday music and hot..."));
        listbaihat1.add(new SingleItemRecycleview("http://i.9mobi.vn/cf/images/2015/03/nkk/nhung-hinh-anh-dep-7.jpg","Fusion Music","Wander|A Chill Mix(..."));
        listbaihat1.add(new SingleItemRecycleview("http://i.9mobi.vn/cf/images/2015/03/nkk/nhung-hinh-anh-dep-8.jpg","Eliana Cogine","musicas relaxantes"));
        listbaihat1.add(new SingleItemRecycleview("http://i.9mobi.vn/cf/images/2015/03/nkk/nhung-hinh-anh-dep-9.jpg","J e z i k a","Chillax Mood"));
        listbaihat1.add(new SingleItemRecycleview("http://i.9mobi.vn/cf/images/2015/03/nkk/nhung-hinh-anh-dep-10.jpg","Lordafi","Late Night Drive"));
        listbaihat1.add(new SingleItemRecycleview("http://i.9mobi.vn/cf/images/2015/03/nkk/nhung-hinh-anh-dep-11.jpg","Heather","Chill"));
        listbaihat1.add(new SingleItemRecycleview("http://i.9mobi.vn/cf/images/2015/03/nkk/nhung-hinh-anh-dep-18.jpg","maddxe","Bed Time BLues"));
        //
    }
}

