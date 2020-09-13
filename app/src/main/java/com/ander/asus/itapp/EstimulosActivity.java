package com.ander.asus.itapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class EstimulosActivity extends AppCompatActivity {

    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estimulos);


        models= new ArrayList<>();
        models.add(new Model(R.drawable.cyberbull, "Cyberbullyn", "Diálogo sobre la resolución pacífica de conflictos "));
        models.add(new Model(R.drawable.robo, "Robo utiles", "Diálogo sobre la resolución pacífica de conflictos "));
        models.add(new Model(R.drawable.apodos, "apodos sobrenombre", "Talleres de orientación a la comunidad educativa sobre la importancia de llamar a las personas por su nombre."));

        adapter = new Adapter(models, this);
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);

        Integer[] colors_temp ={
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3)
        };
        colors = colors_temp;

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position < (adapter.getCount() -1)&& position < (colors.length) -1 ){
                    viewPager.setBackgroundColor((Integer) argbEvaluator.evaluate(positionOffset, colors[position], colors[position + 1]));



                }
                else {
                    viewPager.setBackgroundColor(colors[colors.length -1]);

                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });







    }
}