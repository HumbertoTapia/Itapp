package com.ander.asus.itapp.manual.derechos.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;
import com.ander.asus.itapp.R;

public class DerechoRespTresActivity extends AppCompatActivity {

    Dialog myDialog;
    boolean chequeado = false;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derecho_resp_tres);
        myDialog = new Dialog (this);
        final LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_joven);

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

    public void mostrarJovenD1(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_joven);
        myDialog.setContentView(R.layout.alert_joven_d1);
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

    public void mostrarJovenD2(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_joven);
        myDialog.setContentView(R.layout.alert_joven_d2);
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

    public void mostrarJovenD3(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_joven);
        myDialog.setContentView(R.layout.alert_joven_d3);
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
    public void mostrarJovenD4(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_joven);
        myDialog.setContentView(R.layout.alert_joven_d4);
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

    public void mostrarJovenR1(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_joven);
        myDialog.setContentView(R.layout.alert_joven_r1);
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

    public void mostrarJovenR2(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_joven);
        myDialog.setContentView(R.layout.alert_joven_r2);
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

    public void mostrarJovenR3(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_joven);
        myDialog.setContentView(R.layout.alert_joven_r3);
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

    public void mostrarJovenR4(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_joven);
        myDialog.setContentView(R.layout.alert_joven_r4);
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