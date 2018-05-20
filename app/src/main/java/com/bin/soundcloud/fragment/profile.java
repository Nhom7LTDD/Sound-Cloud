package com.bin.soundcloud.fragment;

import android.app.Fragment;
import android.app.NotificationManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bin.soundcloud.R;

public class profile extends android.support.v4.app.Fragment {
    View v;


    public profile() {
    }

    @Nullable
    @Override
    public  View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.yourprofile_fragment,container,false);
        return v;



    }


}
