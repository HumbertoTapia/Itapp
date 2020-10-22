package com.ander.asus.itapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ander.asus.itapp.login.Registro;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void lanzar(View view) {
        Intent i = new Intent(this, Registro.class );
        startActivity(i);
    }

    public void ingresar(View view) {
        Intent i = new Intent(this, MenuActivity.class );
        startActivity(i);
    }
}
