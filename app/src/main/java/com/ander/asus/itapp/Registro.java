package com.ander.asus.itapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    private Spinner spinner, spinnerUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        spinner= findViewById(R.id.sp_grado);
        spinnerUsuario= findViewById(R.id.sp_usuario);

        String[]grados={"No aplica","Sexto","Septimo","Octavo","Noveno","Decimo","Once"};
        String[]usuarios={"Estudiante","Docente","Padre de familia","Funcionario"};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, grados);
        spinner.setAdapter(adapter);

        ArrayAdapter<String> adapterUsuario = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, usuarios);
        spinnerUsuario.setAdapter(adapterUsuario);
    }


    public void mensajeRegistro(View v) {
        Toast toast = Toast.makeText(this, "Usuario regitrado", Toast.LENGTH_SHORT);
        toast.show();
    }

}
