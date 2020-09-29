package com.ander.asus.itapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DiagnosticoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostico);
    }

    public void llamarEstudiateEstudiante(View view) {
        Intent i = new Intent(this, Estudiante_estudiante_Activity.class );
        startActivity(i);
    }

    public void llamarEstudiateDocente(View view) {
        Intent i = new Intent(this, Estudiante_docente_Activity.class );
        startActivity(i);
    }

    public void llamarDocenteEstudiante(View view) {
        Intent i = new Intent(this, DocenteEstudianteActivity.class );
        startActivity(i);
    }

    public void llamarEstudianteAdministrativo(View view) {
        Intent i = new Intent(this, EstudianteAdministrativoActivity.class );
        startActivity(i);
    }

    public void llamarAdministrativoEstudiante(View view) {
        Intent i = new Intent(this, AdministrativoEstudianteActivity.class );
        startActivity(i);
    }

    public void llamarEstudianteDirectivo(View view) {
        Intent i = new Intent(this, EstudianteDirectivoActivity.class );
        startActivity(i);
    }

    public void llamarDirectivoEstudiante(View view) {
        Intent i = new Intent(this, Directivo_estudiante_Activity.class );
        startActivity(i);
    }

    public void llamarPadreFamilia(View view) {
        Intent i = new Intent(this, Padre_Familia_diag_Activity.class );
        startActivity(i);
    }

    public void llamarOrdenGeneral(View view) {
        Intent i = new Intent(this, Orden_General_Activity.class );
        startActivity(i);
    }

}