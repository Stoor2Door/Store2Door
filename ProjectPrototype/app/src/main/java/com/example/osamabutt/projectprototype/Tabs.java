package com.example.osamabutt.projectprototype;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Osama Butt on 05/15/2017.
 */

public class Tabs extends Fragment {

    public static TabLayout tl;
    public static ViewPager vp;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View v=inflater.inflate(R.layout.mainscreentablayout,container,false);

        tl=(TabLayout)v.findViewById(R.id.tabs);
        tl.addTab(tl.newTab().setText("Items"));
        //tl.addTab(tl.newTab().setIcon(R.drawable.message_icon));
        tl.addTab(tl.newTab().setText("Cart"));
        //tl.addTab(tl.newTab().setIcon(R.drawable.text_me_icon));
        //tl.addTab(tl.newTab().setText("TextMe Calls"));
        //tl.addTab(tl.newTab().setIcon(R.drawable.call_icon));

        vp=(ViewPager)v.findViewById(R.id.pager);
        AppCompatActivity ac=(AppCompatActivity)getActivity();
        TabAdapter td=new TabAdapter(ac.getSupportFragmentManager());
        vp.setAdapter(td);

        vp.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tl));


        tl.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return v;
    }
}
