package com.ander.asus.itapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }


    //metodo para llamar al activity Estudiante
    public void llamarEstudiate(View view) {
        Intent i = new Intent(this, EstudianteActivity.class );
        startActivity(i);
    }

}