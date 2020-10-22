package com.ander.asus.itapp.manual;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ander.asus.itapp.manual.estimulos.EstimuloActivity;
import com.ander.asus.itapp.manual.derechos.DerechosActivity;
import com.ander.asus.itapp.manual.diagnostico.DiagnosticoActivity;
import com.ander.asus.itapp.manual.pactos.Pactos_convivencia_Activity;
import com.ander.asus.itapp.manual.perfiles.PerfilActivity;
import com.ander.asus.itapp.manual.protocolos.ProtocoloActivity;
import com.ander.asus.itapp.R;
import com.ander.asus.itapp.manual.ruta.RutaTipoTresActivity;
import com.ander.asus.itapp.manual.ruta.Ruta_Atencion_Activity;
import com.ander.asus.itapp.ruta.TipoAtencionActivity;

public class ManualActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);





    }

    public void llamarPerfil(View view) {
        Intent i = new Intent(this, PerfilActivity.class );
        startActivity(i);
    }

    public void llamardiagnostico(View view) {
        Intent i = new Intent(this, DiagnosticoActivity.class );
        startActivity(i);
    }

    public void llamarDerechos(View view) {
        Intent i = new Intent(this, DerechosActivity.class );
        startActivity(i);
    }

    public void llamarPactoConvivencia(View view) {
        Intent i = new Intent(this, Pactos_convivencia_Activity.class );
        startActivity(i);
    }

    public void llamarRutaAtencion(View view) {
        Intent i = new Intent(this, Ruta_Atencion_Activity.class );
        startActivity(i);
    }
    public void llamarProtocolos(View view) {
        Intent i = new Intent(this, ProtocoloActivity.class );
        startActivity(i);
    }
    public void llamarEstimulos(View view) {
        Intent i = new Intent(this, EstimuloActivity.class );
        startActivity(i);
    }


}