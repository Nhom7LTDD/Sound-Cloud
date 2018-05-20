package com.bin.soundcloud.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bin.soundcloud.Data.SingleItemRecycleView_Vertical;
import com.bin.soundcloud.R;
import com.bumptech.glide.Glide;

import java.util.List;

public class RecycleViewAdapter_ListsongVertical extends RecyclerView.Adapter<RecycleViewAdapter_ListsongVertical.MyViewHolder> {
    Context mcontext;
    List<SingleItemRecycleView_Vertical> listsongvertical;

    public RecycleViewAdapter_ListsongVertical(Context mcontext, List<SingleItemRecycleView_Vertical> listsongvertical) {
        this.mcontext = mcontext;
        this.listsongvertical = listsongvertical;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(mcontext).inflate(R.layout.listsong_vertical,null);
        MyViewHolder mh=new MyViewHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Glide.with(mcontext)
                .asBitmap()
                .load(listsongvertical.get(position).getImgbaihat())
                .into(holder.anhbaihat);
        holder.tencasi.setText(listsongvertical.get(position).getTencasi());
        holder.tenbaihat.setText(listsongvertical.get(position).getTenbaihat());
        holder.dungluong.setText(listsongvertical.get(position).getDungluong());
        holder.timesong.setText(listsongvertical.get(position).getTimesong());
    }

    @Override
    public int getItemCount() {
        return listsongvertical.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView anhbaihat;
        private TextView tenbaihat;
        private TextView tencasi;
        private TextView dungluong;
        private TextView timesong;
        public MyViewHolder(View itemView) {
            super(itemView);
            this.anhbaihat=(ImageView) itemView.findViewById(R.id.listsong_img);
            this.tencasi=(TextView) itemView.findViewById(R.id.tencasilistsong);
            this.tenbaihat=(TextView) itemView.findViewById(R.id.tenbaihatlistsong);
            this.dungluong=(TextView) itemView.findViewById(R.id.dungluongbaihat);
            this.timesong=(TextView) itemView.findViewById(R.id.timesong);
        }
    }
}

