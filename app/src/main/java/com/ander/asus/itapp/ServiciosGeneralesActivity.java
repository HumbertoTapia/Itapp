package com.ander.asus.itapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class ServiciosGeneralesActivity extends AppCompatActivity {

    Dialog myDialog;
    boolean chequeado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios_generales);

        myDialog = new Dialog (this);
        final LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_servicio_general);

        lottieAnimationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chequeado){
                    lottieAnimationView.setSpeed(1);
                    lottieAnimationView.playAnimation();
                    chequeado = false;
                }
                else{
                    lottieAnimationView.setSpeed(1);
                    lottieAnimationView.playAnimation();
                    chequeado = true;

                }
            }
        });


    }

    public void mostrarGeneralD1(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_servicio_general);
        myDialog.setContentView(R.layout.alert_general_d1);
        btnSalir = myDialog.findViewById(R.id.btn_salir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();
        lottieAnimationView.setSpeed(1);
        lottieAnimationView.playAnimation();
    }

    public void mostrarGeneralD2(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_servicio_general);
        myDialog.setContentView(R.layout.alert_general_d2);
        btnSalir = myDialog.findViewById(R.id.btn_salir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();
        lottieAnimationView.setSpeed(1);
        lottieAnimationView.playAnimation();
    }

    public void mostrarGeneralD3(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_servicio_general);
        myDialog.setContentView(R.layout.alert_general_d3);
        btnSalir = myDialog.findViewById(R.id.btn_salir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();
        lottieAnimationView.setSpeed(2);
        lottieAnimationView.playAnimation();
    }

    public void mostrarGeneralD4(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_servicio_general);
        myDialog.setContentView(R.layout.alert_general_d4);
        btnSalir = myDialog.findViewById(R.id.btn_salir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();
        lottieAnimationView.setSpeed(1);
        lottieAnimationView.playAnimation();
    }

    public void mostrarGeneralR1(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_servicio_general);
        myDialog.setContentView(R.layout.alert_general_r1);
        btnSalir = myDialog.findViewById(R.id.btn_salir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();
        lottieAnimationView.setSpeed(1);
        lottieAnimationView.playAnimation();
    }

    public void mostrarGeneralR2(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_servicio_general);
        myDialog.setContentView(R.layout.alert_general_r2);
        btnSalir = myDialog.findViewById(R.id.btn_salir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();
        lottieAnimationView.setSpeed(1);
        lottieAnimationView.playAnimation();
    }
    public void mostrarGeneralR3(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_servicio_general);
        myDialog.setContentView(R.layout.alert_general_r3);
        btnSalir = myDialog.findViewById(R.id.btn_salir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();
        lottieAnimationView.setSpeed(1);
        lottieAnimationView.playAnimation();
    }

    public void mostrarGeneralR4(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_servicio_general);
        myDialog.setContentView(R.layout.alert_general_r4);
        btnSalir = myDialog.findViewById(R.id.btn_salir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.show();
        lottieAnimationView.setSpeed(1);
        lottieAnimationView.playAnimation();
    }

}