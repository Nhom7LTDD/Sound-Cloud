package com.bin.soundcloud;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewpageAdapter extends FragmentPagerAdapter {
    private final List<Fragment> lstFragment =new ArrayList<>();
    private final List<String> lsttitles =new ArrayList<>();

    public ViewpageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return lstFragment.get(position);
    }

    @Override
    public int getCount() {
        return lsttitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lsttitles.get(position);
    }

    public  void AddFragment (Fragment fragment,String tile){
        lstFragment.add(fragment);
        lsttitles.add(tile);
    }
}
