package com.sourcey.materiallogindemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sourcey.materiallogindemo.LoginActivity;
import com.sourcey.materiallogindemo.Login_tab;
import com.sourcey.materiallogindemo.Menus;
import com.sourcey.materiallogindemo.androids;
import com.sourcey.materiallogindemo.Set_reservation;

/**
 * Created by Aneh on 1/19/2015.
 */

public class TabsPagerAdapter extends FragmentPagerAdapter {
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                return new Menus();
            case 1:
                return new Set_reservation();
            case 2:
                return new Login_tab();
            case 3:
                return  new androids();


        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 4;
    }
}

