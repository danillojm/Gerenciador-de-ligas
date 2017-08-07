package com.melo.danillo.gerenciadordeligas.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.melo.danillo.gerenciadordeligas.fragments.FinalizadoFragment;
import com.melo.danillo.gerenciadordeligas.fragments.MeuClubeFragment;
import com.melo.danillo.gerenciadordeligas.fragments.MinhasLigasFragment;

/**
 * Created by Danillo on 05/08/2017.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private static int TAB_COUNT = 3;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return MinhasLigasFragment.newInstance();
            case 1:
                return MeuClubeFragment.newInstance();
            case 2:
                return FinalizadoFragment.newInstance();
        }

        return null;
    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return MinhasLigasFragment.TITLE;

            case 1:
                return MeuClubeFragment.TITLE;

            case 2:
                return FinalizadoFragment.TITLE;
        }
        return super.getPageTitle(position);
    }
}
