package com.ander.asus.itapp.manual.perfiles.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ander.asus.itapp.R;

public class DocenteEstudianteActivity extends AppCompatActivity {
    Dialog myDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docente_estudiante);
        myDialog = new Dialog (this);
    }

    public void mostrar7(View view) {
        Button btnSalir;
        myDialog.setContentView(R.layout.alert_doc_est1);
        btnSalir = myDialog.findViewById(R.id.btn_salir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();
    }

    public void mostrar8(View view) {
        Button btnSalir;
        myDialog.setContentView(R.layout.alert_doc_est2);
        btnSalir = myDialog.findViewById(R.id.btn_salir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();
    }

    public void mostrar9(View view) {
        Button btnSalir;
        myDialog.setContentView(R.layout.alert_doc_est3);
        btnSalir = myDialog.findViewById(R.id.btn_salir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();
    }
    public void mostrar10(View view) {
        Button btnSalir;
        myDialog.setContentView(R.layout.alert_doc_est4);
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