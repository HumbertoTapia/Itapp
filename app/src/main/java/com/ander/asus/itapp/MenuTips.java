package com.ander.asus.itapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuTips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_tips);
    }

    public void ingresarTipAmbiente(View view) {
        Intent i = new Intent(this,  TipAmbiente.class );
        startActivity(i);
    }

    public void ingresarTipEscolar(View view) {
        Intent i = new Intent(this,  TipsEscolares.class );
        startActivity(i);
    }


    public void ingresarTipFamilia(View view) {
        Intent i = new Intent(this,  TipsFamilia.class );
        startActivity(i);
    }
}
