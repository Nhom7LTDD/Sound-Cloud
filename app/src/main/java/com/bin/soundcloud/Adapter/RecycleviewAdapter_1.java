package com.bin.soundcloud.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bin.soundcloud.Data.SingleItemRecycleview;
import com.bin.soundcloud.R;
import com.bin.soundcloud.item_song;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class RecycleviewAdapter_1 extends RecyclerView.Adapter<RecycleviewAdapter_1.MyViewHolder>{

    Context mcontext;
    List<SingleItemRecycleview> listsong;

    public RecycleviewAdapter_1(Context mcontext, List<SingleItemRecycleview> listsong) {
        this.mcontext = mcontext;
        this.listsong = listsong;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemcon_recycleview,parent,false);
        MyViewHolder vh=new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        Glide.with(mcontext)
                .asBitmap()
                .load(listsong.get(position).getImage())
                .apply(new RequestOptions().override(140,140))
                .into(holder.anhbaihat)
                ;
        holder.tenbaihat.setText(listsong.get(position).getTenbaihat());
        holder.tencasi.setText(listsong.get(position).getTencasi());


// on item click
       holder.parentlayout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {


               Intent intent=new Intent(mcontext,item_song.class);
               intent.putExtra("anhbaihatitemsong",listsong.get(position).getImage());
               intent.putExtra("tencasi",listsong.get(position).getTencasi());
               intent.putExtra("tenaihat",listsong.get(position).getTenbaihat());
               intent.putExtra("urlbaihat",listsong.get(position).getUrlbaihat());
               mcontext.startActivity(intent);
           }
       });



    }

    @Override
    public int getItemCount() {
        return listsong.size();
    }

    public static  class MyViewHolder extends RecyclerView.ViewHolder {

        private RelativeLayout parentlayout;
        private TextView tenbaihat;
        private  TextView tencasi;
        private ImageView anhbaihat;



        public MyViewHolder(View itemView) {
            super(itemView);
            parentlayout=  itemView.findViewById(R.id.parentlayout);
            this.tenbaihat= itemView.findViewById(R.id.tenbaihat);
            this.tencasi=itemView.findViewById(R.id.tencasi);
            this.anhbaihat= itemView.findViewById(R.id.anhbaihat);

        }






    }
}
