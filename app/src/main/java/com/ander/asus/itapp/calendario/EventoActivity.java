package com.ander.asus.itapp.calendario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ander.asus.itapp.R;

public class EventoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evento);
    }

    public void llamarEventosDetalle(View view) {
        Intent i = new Intent(this, EventoDetalleActivity.class );
        startActivity(i);
    }
}