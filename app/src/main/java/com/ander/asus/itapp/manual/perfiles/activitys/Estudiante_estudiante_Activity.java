package com.ander.asus.itapp.manual.perfiles.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ander.asus.itapp.R;

public class Estudiante_estudiante_Activity extends AppCompatActivity {
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante_estudiante_);
        myDialog = new Dialog (this);
    }

    public void mostrar(View view){
        Button btnSalir;
        myDialog.setContentView(R.layout.alert_ejem);
        btnSalir = myDialog.findViewById(R.id.btn_salir);
       btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();

    }
    public void mostrar2(View view){
        Button btnSalir;
        myDialog.setContentView(R.layout.alert_dialog_est2);
        btnSalir = myDialog.findViewById(R.id.btn_salir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();

    }


    public void mostrar3(View view){
        Button btnSalir;
        myDialog.setContentView(R.layout.alert_dialog_est3);
        btnSalir = myDialog.findViewById(R.id.btn_salir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();

    }

    public void mostrar4(View view){
        Button btnSalir;
        myDialog.setContentView(R.layout.alert_dialog4);
        btnSalir = myDialog.findViewById(R.id.btn_salir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();

    }
    }