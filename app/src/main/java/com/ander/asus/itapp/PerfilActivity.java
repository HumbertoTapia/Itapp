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
    public void llamarDocente(View view) {
        Intent i = new Intent(this, DocenteActivity.class );
        startActivity(i);
    }
    public void llamarPadre(View view) {
        Intent i = new Intent(this, PadreActivity.class );
        startActivity(i);
    }
    public void llamarAdministrativo(View view) {
        Intent i = new Intent(this, FuncionarioActivity.class );
        startActivity(i);
    }



}