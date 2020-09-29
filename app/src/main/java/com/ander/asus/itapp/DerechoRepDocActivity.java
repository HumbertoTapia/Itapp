package com.ander.asus.itapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class DerechoRepDocActivity extends AppCompatActivity {

    Dialog myDialog;
    boolean chequeado = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derecho_rep_doc);

        myDialog = new Dialog (this);
        final LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_docente);

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

    public void mostrarDocenteD1(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_docente);
        myDialog.setContentView(R.layout.alert_docente_d1);
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

    public void mostrarDocenteD2(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_docente);
        myDialog.setContentView(R.layout.alert_docente_d2);
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

    public void mostrarDocenteD3(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_docente);
        myDialog.setContentView(R.layout.alert_docente_d3);
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

    public void mostrarDocenteD4(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_docente);
        myDialog.setContentView(R.layout.alert_docente_d4);
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

    public void mostrarDocenteD5(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_docente);
        myDialog.setContentView(R.layout.alert_docente_d5);
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

    public void mostrarDocenteD6(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_docente);
        myDialog.setContentView(R.layout.alert_docente_d6);
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

    public void mostrarDocenteD7(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_docente);
        myDialog.setContentView(R.layout.alert_docente_d7);
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

    public void mostrarDocenteD8(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_docente);
        myDialog.setContentView(R.layout.alert_docente_d8);
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

    public void mostrarDocenteD9(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_docente);
        myDialog.setContentView(R.layout.alert_docente_d9);
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

    public void mostrarDocenteR1(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_docente);
        myDialog.setContentView(R.layout.alert_docente_r1);
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

    public void mostrarDocenteR2(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_docente);
        myDialog.setContentView(R.layout.alert_docente_r2);
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

    public void mostrarDocenteR3(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_docente);
        myDialog.setContentView(R.layout.alert_docente_r3);
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

    public void mostrarDocenteR4(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_docente);
        myDialog.setContentView(R.layout.alert_docente_r4);
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

    public void mostrarDocenteR5(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_docente);
        myDialog.setContentView(R.layout.alert_docente_r5);
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

    public void mostrarDocenteR6(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_docente);
        myDialog.setContentView(R.layout.alert_docente_r6);
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

    public void mostrarDocenteR7(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_docente);
        myDialog.setContentView(R.layout.alert_docente_r7);
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

    public void mostrarDocenteR8(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_docente);
        myDialog.setContentView(R.layout.alert_docente_r8);
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