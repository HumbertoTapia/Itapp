package com.ander.asus.itapp.manual.perfiles.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ander.asus.itapp.R;

public class Estudiante_docente_Activity extends AppCompatActivity {
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante_docente_);
        myDialog = new Dialog (this);
    }

    public void mostrar5(View view){
        Button btnSalir;
        myDialog.setContentView(R.layout.alert_est_doc_1);
        btnSalir = myDialog.findViewById(R.id.btn_salir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();

    }

    public void mostrar6(View view){
        Button btnSalir;
        myDialog.setContentView(R.layout.alert_est_doc_2);
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