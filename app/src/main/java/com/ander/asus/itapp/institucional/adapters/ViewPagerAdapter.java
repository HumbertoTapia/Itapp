package com.ander.asus.itapp.institucional.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class

ViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragment =  new ArrayList<>();
    private List<String> fragmentTitulos = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return fragment.get(position);
    }

    @Override
    public int getCount() {
        return fragment.size();
    }

/*
    */


    public void addFragment(Fragment fragments, String titulo){
        /* String a = "nombre";    a*/
        fragment.add(fragments);
        fragmentTitulos.add(titulo);
    }
    @Override
    public CharSequence getPageTitle(int position){
        return fragmentTitulos.get(position);
    }


}
