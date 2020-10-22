package com.ander.asus.itapp.manual.perfiles.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ander.asus.itapp.R;

public class AdministrativoEstudianteActivity extends AppCompatActivity {

    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrativo_estudiante);

        myDialog = new Dialog (this);
    }

    public void mostrarAdminEst1(View view){
        Button btnSalir;
        myDialog.setContentView(R.layout.alert_admin_est1);
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