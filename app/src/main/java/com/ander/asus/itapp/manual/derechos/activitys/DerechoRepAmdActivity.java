package com.ander.asus.itapp.manual.derechos.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;
import com.ander.asus.itapp.R;

public class DerechoRepAmdActivity extends AppCompatActivity {

    Dialog myDialog;
    boolean chequeado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derecho_rep_amd);

        myDialog = new Dialog (this);
        final LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_directivo);

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

    public void mostrarDirectivoD1(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_directivo);
        myDialog.setContentView(R.layout.alert_directivo_d1);
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

    public void mostrarDirectivoD2(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_directivo);
        myDialog.setContentView(R.layout.alert_directivo_d2);
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

    public void mostrarDirectivoD3(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_directivo);
        myDialog.setContentView(R.layout.alert_directivo_d3);
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

    public void mostrarDirectivoD4(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_directivo);
        myDialog.setContentView(R.layout.alert_directivo_d4);
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

    public void mostrarDirectivoD5(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_directivo);
        myDialog.setContentView(R.layout.alert_directivo_d5);
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

    public void mostrarDirectivoR1(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_directivo);
        myDialog.setContentView(R.layout.alert_directivo_r1);
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

    public void mostrarDirectivoR2(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_directivo);
        myDialog.setContentView(R.layout.alert_directivo_r2);
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

    public void mostrarDirectivoR3(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_directivo);
        myDialog.setContentView(R.layout.alert_directivo_r3);
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

    public void mostrarDirectivoR4(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_directivo);
        myDialog.setContentView(R.layout.alert_directivo_r4);
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

    public void mostrarDirectivoR5(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_directivo);
        myDialog.setContentView(R.layout.alert_directivo_r5);
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




}