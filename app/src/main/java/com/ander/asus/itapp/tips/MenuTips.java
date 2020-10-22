package com.ander.asus.itapp.tips;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ander.asus.itapp.R;
import com.ander.asus.itapp.tips.TipAmbiente;
import com.ander.asus.itapp.tips.TipsEscolares;
import com.ander.asus.itapp.tips.TipsFamilia;

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
