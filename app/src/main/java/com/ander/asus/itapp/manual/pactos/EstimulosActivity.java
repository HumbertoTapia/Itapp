package com.ander.asus.itapp.manual.pactos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import com.ander.asus.itapp.manual.pactos.adapters.Adapter;
import com.ander.asus.itapp.manual.pactos.modelos.Model;
import com.ander.asus.itapp.R;

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

        //recibir parametros
        String titulo = getIntent().getExtras().getString("titulo");
        String descripcion = getIntent().getExtras().getString("descripcion");
        String descripcion2 = getIntent().getExtras().getString("descripcion2");
        String descripcion3 = getIntent().getExtras().getString("descripcion3");
        //String imagen = getIntent().getExtras().getString("imagen");

        /*
        int s;

        if(imagen.equals("1")){
            s= R.drawable.img_pactos1;
        }else if(imagen.equals("2")){
            s= R.drawable.img_pactos1;
        }else if(imagen.equals("3")){
            s= R.drawable.apodos;
        }else {
            s= R.drawable.ic_visto;
        }*/

        models= new ArrayList<>();
        models.add(new Model(R.drawable.img_pactos1, titulo, descripcion));
        models.add(new Model(R.drawable.img_pactos2, "Indicadores", descripcion2));
        models.add(new Model(R.drawable.img_pactos3, "Frecuencia", descripcion3));

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
                    viewPager.setBackgroundColor(
                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]));



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