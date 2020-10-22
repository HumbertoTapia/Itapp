package com.ander.asus.itapp.ruta;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ander.asus.itapp.R;
import com.ander.asus.itapp.manual.estimulos.EstimuloActivity;
import com.ander.asus.itapp.manual.ruta.TipoUnoActivity;

public class TipoAtencionActivity extends AppCompatActivity {
    Dialog myDialog;
    boolean chequeado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_atencion);
        myDialog = new Dialog (this);

    }





    public void llamarTipoUno(View view) {
        Intent i = new Intent(this, TipoUnoActivity.class );
        startActivity(i);
    }

}