package com.ander.asus.itapp.manual.derechos.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;
import com.ander.asus.itapp.R;

public class DerechoRepFsmiliaActivity extends AppCompatActivity {

    Dialog myDialog;
    boolean chequeado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derecho_rep_fsmilia);

        myDialog = new Dialog (this);
        final LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_familia);

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

    public void mostrarPadreD1(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_familia);
        myDialog.setContentView(R.layout.alert_padre_d1);
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

    public void mostrarPadreD2(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_familia);
        myDialog.setContentView(R.layout.alert_padre_d2);
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

    public void mostrarPadreD3(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_familia);
        myDialog.setContentView(R.layout.alert_padre_d3);
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

    public void mostrarPadreD4(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_familia);
        myDialog.setContentView(R.layout.alert_padre_d4);
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

    public void mostrarPadreD5(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_familia);
        myDialog.setContentView(R.layout.alert_padre_d5);
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
    public void mostrarPadreD6(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_familia);
        myDialog.setContentView(R.layout.alert_padre_d6);
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

    public void mostrarPadreD7(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_familia);
        myDialog.setContentView(R.layout.alert_padre_d7);
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

    public void mostrarPadreD8(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_familia);
        myDialog.setContentView(R.layout.alert_padre_d8);
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

    public void mostrarPadreR1(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_familia);
        myDialog.setContentView(R.layout.alert_padre_r1);
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

    public void mostrarPadreR2(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_familia);
        myDialog.setContentView(R.layout.alert_padre_r2);
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

    public void mostrarPadreR3(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_familia);
        myDialog.setContentView(R.layout.alert_padre_r3);
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

    public void mostrarPadreR4(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_familia);
        myDialog.setContentView(R.layout.alert_padre_r4);
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

    public void mostrarPadreR5(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_familia);
        myDialog.setContentView(R.layout.alert_padre_r5);
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

    public void mostrarPadreR6(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_familia);
        myDialog.setContentView(R.layout.alert_padre_r6);
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

    public void mostrarPadreR7(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_familia);
        myDialog.setContentView(R.layout.alert_padre_r7);
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

    public void mostrarPadreR8(View view) {
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_familia);
        myDialog.setContentView(R.layout.alert_padre_r8);
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