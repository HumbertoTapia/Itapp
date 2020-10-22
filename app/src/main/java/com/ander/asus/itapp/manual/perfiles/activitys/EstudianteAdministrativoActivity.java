package com.ander.asus.itapp.manual.perfiles.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ander.asus.itapp.R;

public class EstudianteAdministrativoActivity extends AppCompatActivity {

    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante_administrativo);

        myDialog = new Dialog (this);
    }

    public void mostrarEstAdmin1(View view){
        Button btnSalir;
        myDialog.setContentView(R.layout.alert_est_admin);
        btnSalir = myDialog.findViewById(R.id.btn_salir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();

    }

    public void mostrarEstAdmin2(View view){
        Button btnSalir;
        myDialog.setContentView(R.layout.alert_est_admin2);
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