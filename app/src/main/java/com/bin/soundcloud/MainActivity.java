package com.bin.soundcloud;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TabLayout tablayout;
    private ViewPager viewPager;
    private ViewpageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Fragment
        tablayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.viewpage);
        adapter = new ViewpageAdapter(getSupportFragmentManager());
        //Add fragment
        adapter.AddFragment(new home_fragment(), "");
        adapter.AddFragment(new find_fragment(), "");
        adapter.AddFragment(new search_fragment(), "");
        adapter.AddFragment(new love_fragment(), "");
        adapter.AddFragment(new profile(), "");
        viewPager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPager);

        tablayout.getTabAt(0).setIcon(R.drawable.home);
        tablayout.getTabAt(1).setIcon(R.drawable.flash);
        tablayout.getTabAt(2).setIcon(R.drawable.search);
        tablayout.getTabAt(3).setIcon(R.drawable.heart);
        tablayout.getTabAt(4).setIcon(R.drawable.menu);


    }
}
