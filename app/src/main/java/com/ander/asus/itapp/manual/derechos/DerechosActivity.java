package com.ander.asus.itapp.manual.derechos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.ander.asus.itapp.R;
import com.ander.asus.itapp.institucional.adapters.ViewPagerAdapter;
import com.ander.asus.itapp.manual.derechos.activitys.AdministrativoActivity;
import com.ander.asus.itapp.manual.derechos.activitys.DerechoRepAmdActivity;
import com.ander.asus.itapp.manual.derechos.activitys.DerechoRepDocActivity;
import com.ander.asus.itapp.manual.derechos.activitys.DerechoRepFsmiliaActivity;
import com.ander.asus.itapp.manual.derechos.activitys.DerechoRespActivity;
import com.ander.asus.itapp.manual.derechos.activitys.DerechoRespTresActivity;
import com.ander.asus.itapp.manual.derechos.activitys.DerechosRespDosActivity;
import com.ander.asus.itapp.manual.derechos.activitys.ServiciosGeneralesActivity;
import com.ander.asus.itapp.manual.derechos.fragments.DocenteFragment;
import com.ander.asus.itapp.manual.derechos.fragments.EstudianteFragment;
import com.ander.asus.itapp.manual.derechos.fragments.FuncionarioFragment;
import com.ander.asus.itapp.manual.derechos.fragments.PadresFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class DerechosActivity extends AppCompatActivity {

    private ImageView imageView;
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derechos);


        setUpView();
        SetUpViewPagerAdapter();

    }
    private void SetUpViewPagerAdapter() {

        viewPagerAdapter.addFragment(new EstudianteFragment(), "Estudiante");
        viewPagerAdapter.addFragment(new DocenteFragment(), "Docente");
        viewPagerAdapter.addFragment(new PadresFragment(), "Padres de familia");
        viewPagerAdapter.addFragment(new FuncionarioFragment(), "Funcionario");

        viewPager.setAdapter(viewPagerAdapter);


        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                switch (tab.getPosition()) {
                    case 0:
                        imageView.setImageResource(R.drawable.estudiante);
                        break;
                    case 1:
                        imageView.setImageResource(R.drawable.docente);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.padredefamilia);
                        break;

                    case 3:
                        imageView.setImageResource(R.drawable.padredefamilia);
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

    public void llamarPrimeraInfancia(View view) {
        Intent i = new Intent(this, DerechoRespActivity.class );
        startActivity(i);
    }

    public void llamarInfancia(View view) {
        Intent i = new Intent(this, DerechosRespDosActivity.class );
        startActivity(i);
    }

    public void llamarAdolescencia(View view) {
        Intent i = new Intent(this, DerechoRespTresActivity.class );
        startActivity(i);
    }

    public void llamarDocenteDesecho(View view) {
        Intent i = new Intent(this, DerechoRepDocActivity.class );
        startActivity(i);
    }

    public void llamarDocenteAdmi(View view) {
        Intent i = new Intent(this, DerechoRepAmdActivity.class );
        startActivity(i);
    }

    public void llamarFamilia(View view) {
        Intent i = new Intent(this, DerechoRepFsmiliaActivity.class );
        startActivity(i);
    }

    public void llamarAdministrativo(View view) {
        Intent i = new Intent(this, AdministrativoActivity.class );
        startActivity(i);
    }

    public void llamarServiciosGenerales(View view) {
        Intent i = new Intent(this, ServiciosGeneralesActivity.class );
        startActivity(i);
    }



}