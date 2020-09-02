package com.ander.asus.itapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TipAmbiente extends AppCompatActivity {

    private static final String TAG = "TipAmbiente";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_ambiente);


        ImageView ImageViewShowDialogoReciclaje = findViewById(R.id.iv_reciclaje);
        ImageView IvDialogBolsa = findViewById(R.id.iv_bolsa);







        ImageViewShowDialogoReciclaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogo();

            }

        });


        IvDialogBolsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showDialogo2();

            }
        });
    }





    void showDialogo (){

        LayoutInflater inflater = LayoutInflater.from(this);
        View view= inflater.inflate(R.layout.alert_dialog_reciclaje,null);

        Button btn_aceptar = view.findViewById(R.id.btn_aceptar);


        final AlertDialog alertDialog = new AlertDialog.Builder(this).setView(view).create();


        btn_aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.dismiss();

            }
        });

        alertDialog.show();

    }


    void showDialogo2 (){

        LayoutInflater inflater = LayoutInflater.from(this);
        View view= inflater.inflate(R.layout.alert_dialog_bolsas,null);

        Button btn_aceptar = view.findViewById(R.id.btn_aceptar);


        final AlertDialog alertDialog = new AlertDialog.Builder(this).setView(view).create();


        btn_aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.dismiss();

            }
        });





        alertDialog.show();

    }
}
