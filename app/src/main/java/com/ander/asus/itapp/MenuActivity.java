package com.ander.asus.itapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ander.asus.itapp.calendario.EventoActivity;
import com.ander.asus.itapp.institucional.InstitucionActivity;
import com.ander.asus.itapp.manual.ManualActivity;
import com.ander.asus.itapp.pdf.PdfActivity;
import com.ander.asus.itapp.test.MenuTestActivity;
import com.ander.asus.itapp.tips.MenuTips;

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
        Intent i = new Intent(this, InstitucionActivity.class );
        startActivity(i);
    }

    public void ingresarCalendario(View view) {
        Intent i = new Intent(this, EventoActivity.class );
        startActivity(i);
    }

    //Metodo que llama a la activity Manual de Convivencia
    public void ingresarManual(View view) {
        Intent i = new Intent(this, ManualActivity.class );
        startActivity(i);
    }

    public void ingresarTest(View view) {
        Intent i = new Intent(this, MenuTestActivity.class );
        startActivity(i);
    }

    public void ingresarPdf(View view) {
        Intent i = new Intent(this, PdfActivity.class );
        startActivity(i);
    }



}
