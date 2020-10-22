package com.ander.asus.itapp.institucional;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;

import com.ander.asus.itapp.institucional.fragmets.FilosofiaFragment;
import com.ander.asus.itapp.institucional.fragmets.HimnoFragment;
import com.ander.asus.itapp.institucional.fragmets.MisionFragment;
import com.ander.asus.itapp.institucional.fragmets.ObjetivoFragment;
import com.ander.asus.itapp.R;
import com.ander.asus.itapp.institucional.adapters.ViewPagerAdapter;
import com.ander.asus.itapp.institucional.fragmets.VisionFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class InstitucionActivity extends AppCompatActivity {

    private ImageView imageView;
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institucion);

        setUpView();
        SetUpViewPagerAdapter();
    }

    private void SetUpViewPagerAdapter() {

        viewPagerAdapter.addFragment(new FilosofiaFragment(),"FILOSOFIA");
        viewPagerAdapter.addFragment(new MisionFragment(),"MISIòN");
        viewPagerAdapter.addFragment(new VisionFragment(),"VISIóN");

        viewPagerAdapter.addFragment(new HimnoFragment(),"HIMNO");
        viewPagerAdapter.addFragment(new ObjetivoFragment(),"OBJETIVOS");
        viewPager.setAdapter(viewPagerAdapter);


        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                switch (tab.getPosition()){
                    case 0:
                    imageView.setImageResource(R.drawable.visionbanner);
                    break;
                    case 1:
                        imageView.setImageResource(R.drawable.mision);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.himno);
                        break;

                    case 3:
                        imageView.setImageResource(R.drawable.filosofia);
                        break;

                    case 4:
                        imageView.setImageResource(R.drawable.objetivos);
                        break;


                    default:
                        break;

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }

    private void setUpView() {

        imageView = findViewById(R.id.imgView_id);
        tabLayout = findViewById(R.id.tabLayout_id);
        appBarLayout = findViewById(R.id.appBarLayout_id);
        viewPager = findViewById(R.id.viewPager_id);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
    }
}
