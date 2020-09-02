package com.ander.asus.itapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void ingresarmMenuTips(View view) {
        Intent i = new Intent(this, MenuTips.class );
        startActivity(i);
    }

    public void ingresarInstitucion(View view) {
        Intent i = new Intent(this, Institucion.class );
        startActivity(i);
    }

    public void ingresarCalendario(View view) {
        Intent i = new Intent(this, Calendario.class );
        startActivity(i);
    }

    //Metodo que llama a la activity Manual de Convivencia
    public void ingresarManual(View view) {
        Intent i = new Intent(this, ManualActivity.class );
        startActivity(i);
    }



}