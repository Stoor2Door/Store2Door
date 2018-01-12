package com.example.osamabutt.projectprototype;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Osama Butt on 05/15/2017.
 */

public class TabAdapter extends FragmentStatePagerAdapter{

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f;
        switch (position)
        {
            case 0:
//                f=new itempage();
//                        break;
//            case 1:
//                f=new NetMessageTab();
//                break;
//            case 3:
//                f=new NetCallTab();
//                break;
            default:
                f=new Fragment();
        }

        return f;
    }

    @Override
    public int getCount() {
        return 1;
    }
}
