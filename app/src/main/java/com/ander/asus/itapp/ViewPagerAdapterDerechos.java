package com.ander.asus.itapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapterDerechos extends FragmentPagerAdapter {

    private List<Fragment> fragments = new ArrayList<>();
    private List<String> fragmentsTitulos = new ArrayList<>();

    public ViewPagerAdapterDerechos (FragmentManager fragmentManager){
        super(fragmentManager);


    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();

    }

    @Override
    public CharSequence getPageTitle (int position){
        return fragmentsTitulos.get(position);

    }
    public void addFragment (Fragment fragment,String titulo){
        fragments.add(fragment);
        fragmentsTitulos.add(titulo);



    }
}
