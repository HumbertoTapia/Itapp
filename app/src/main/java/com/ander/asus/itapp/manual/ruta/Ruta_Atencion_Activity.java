package com.ander.asus.itapp.manual.ruta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;
import com.ander.asus.itapp.R;
import com.ander.asus.itapp.manual.ruta.fragments.TipoDosFragment;
import com.ander.asus.itapp.manual.ruta.fragments.TipoTresFragment;
import com.ander.asus.itapp.manual.ruta.fragments.TipoUnoFragment;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Ruta_Atencion_Activity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

        boolean salir;
    BottomNavigationView navigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruta__atencion_);
        navigation = findViewById(R.id.bnv_menu);
        navigation.setOnNavigationItemSelectedListener(this);

        getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                .replace(R.id.fl_menu, TipoUnoFragment.newInstance())
                .commit();

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        salir = false;

        switch (menuItem.getItemId()) {

            case R.id.menu_inicio:
                getSupportFragmentManager()
                        .beginTransaction()
                        .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                        .replace(R.id.fl_menu, TipoUnoFragment.newInstance())
                        .commit();
                return true;

            case R.id.menu_promo:
                getSupportFragmentManager()
                        .beginTransaction()
                        .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                        .replace(R.id.fl_menu, TipoDosFragment.newInstance())
                        .commit();
                return true;
            case R.id.menu_ordenes:
                getSupportFragmentManager()
                        .beginTransaction()
                        .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                        .replace(R.id.fl_menu, TipoTresFragment.newInstance())
                        .commit();

                return true;

        }

        return false;
    }
}