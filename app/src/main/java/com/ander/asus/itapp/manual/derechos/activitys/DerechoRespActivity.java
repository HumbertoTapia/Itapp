package com.ander.asus.itapp.manual.derechos.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;
import com.ander.asus.itapp.R;

public class DerechoRespActivity extends AppCompatActivity {
    Dialog myDialog;

    boolean chequeado = false;
    boolean chequeado2 = false;
    boolean chequeado3 = false;
    boolean chequeado4 = false;
    boolean chequeado5 = false;
    boolean chequeado6 = false;
    boolean chequeado7 = false;
    boolean chequeado8 = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derecho_resp);

        myDialog = new Dialog (this);


        final LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_bebe);

        final LottieAnimationView lottieAnimationView2 = findViewById(R.id.animacion2);
        final LottieAnimationView lottieAnimationView3 = findViewById(R.id.animacion3);
        final LottieAnimationView lottieAnimationView4 = findViewById(R.id.animacion4);
        final LottieAnimationView lottieAnimationView5 = findViewById(R.id.animacion5);
        final LottieAnimationView lottieAnimationView6 = findViewById(R.id.animacion6);
        final LottieAnimationView lottieAnimationView7 = findViewById(R.id.animacion7);
        final LottieAnimationView lottieAnimationView8 = findViewById(R.id.animacion8);


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


        lottieAnimationView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chequeado2){
                    lottieAnimationView2.setSpeed(1);
                    lottieAnimationView2.playAnimation();
                    chequeado2 = false;
                }
                else{
                    lottieAnimationView2.setSpeed(1);
                    lottieAnimationView2.playAnimation();
                    chequeado2 = true;

                }
            }
        });

        lottieAnimationView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chequeado3){
                    lottieAnimationView3.setSpeed(1);
                    lottieAnimationView3.playAnimation();
                    chequeado3 = false;
                }
                else{
                    lottieAnimationView3.setSpeed(1);
                    lottieAnimationView3.playAnimation();
                    chequeado3 = true;

                }
            }
        });
        lottieAnimationView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chequeado4){
                    lottieAnimationView4.setSpeed(1);
                    lottieAnimationView4.playAnimation();
                    chequeado4 = false;
                }
                else{
                    lottieAnimationView4.setSpeed(1);
                    lottieAnimationView4.playAnimation();
                    chequeado4 = true;

                }
            }
        });

        lottieAnimationView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chequeado5){
                    lottieAnimationView5.setSpeed(1);
                    lottieAnimationView5.playAnimation();
                    chequeado5 = false;
                }
                else{
                    lottieAnimationView5.setSpeed(1);
                    lottieAnimationView5.playAnimation();
                    chequeado5 = true;

                }
            }
        });
        lottieAnimationView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chequeado6){
                    lottieAnimationView6.setSpeed(1);
                    lottieAnimationView6.playAnimation();
                    chequeado6 = false;
                }
                else{
                    lottieAnimationView6.setSpeed(1);
                    lottieAnimationView6.playAnimation();
                    chequeado6 = true;

                }
            }
        });

        lottieAnimationView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chequeado7){
                    lottieAnimationView7.setSpeed(1);
                    lottieAnimationView7.playAnimation();
                    chequeado7 = false;
                }
                else{
                    lottieAnimationView7.setSpeed(1);
                    lottieAnimationView7.playAnimation();
                    chequeado7 = true;

                }
            }
        });

        lottieAnimationView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chequeado8){
                    lottieAnimationView8.setSpeed(1);
                    lottieAnimationView8.playAnimation();
                    chequeado8 = false;

                }
                else{
                    lottieAnimationView8.setSpeed(1);
                    lottieAnimationView8.playAnimation();
                    chequeado8 = true;

                }
            }
        });




    }

    public void mostrarprimerainfancia(View view){
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_bebe);
        myDialog.setContentView(R.layout.alert_primera_infancia);
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

    public void mostrarAlert2(View view){
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_bebe);
        myDialog.setContentView(R.layout.alert_primera_infancia_d1);
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


    public void mostrarAlert3(View view){
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_bebe);
        myDialog.setContentView(R.layout.alert_primera_infancia_d2);
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

    public void mostrarAlert4(View view){
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_bebe);
        myDialog.setContentView(R.layout.alert_primera_infancia_d3);
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

    public void mostrarAlertResp(View view){
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_bebe);
        myDialog.setContentView(R.layout.alert_primera_infancia_resp);
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

    public void mostrarAlertResp1(View view){
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_bebe);
        myDialog.setContentView(R.layout.alert_primera_infancia_resp1);
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

    public void mostrarAlertResp2(View view){
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_bebe);
        myDialog.setContentView(R.layout.alert_primera_infancia_resp2);
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

    public void mostrarAlertResp3(View view){
        Button btnSalir;
        LottieAnimationView lottieAnimationView = findViewById(R.id.animacion_bebe);
        myDialog.setContentView(R.layout.alert_primera_infancia_resp3);
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