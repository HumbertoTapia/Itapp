package com.ander.asus.itapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ManualActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);
    }

    public void llamarPerfil(View view) {
        Intent i = new Intent(this, PerfilActivity.class );
        startActivity(i);
    }

    public void llamardiagnostico(View view) {
        Intent i = new Intent(this, DiagnosticoActivity.class );
        startActivity(i);
    }
}