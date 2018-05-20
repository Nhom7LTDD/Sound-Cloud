package com.bin.soundcloud.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bin.soundcloud.R;

public class find_fragment extends android.support.v4.app.Fragment {
    View v;
    public find_fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.find_fragment,container,false);
        return v;
    }
}
