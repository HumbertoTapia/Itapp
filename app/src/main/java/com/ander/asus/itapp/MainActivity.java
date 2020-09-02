package com.ander.asus.itapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

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
        Intent i = new Intent(this, Menu.class );
        startActivity(i);
    }
}
