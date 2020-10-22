package com.ander.asus.itapp.manual.pactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.ander.asus.itapp.R;

public class Pactos_convivencia_Activity extends AppCompatActivity {
    //1. definir las variavles de tipo imageview
    ImageView iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv9, iv10, iv11, iv12, iv13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pactos_convivencia_);
        //2. asociar las variables con los elementos image view
        iv1 = findViewById(R.id.iv_1);
        iv2 = findViewById(R.id.iv_2);
        iv3 = findViewById(R.id.iv_3);
        iv4 = findViewById(R.id.iv_4);
        iv5 = findViewById(R.id.iv_5);
        iv6 = findViewById(R.id.iv_6);
        iv7 = findViewById(R.id.iv_7);
        iv8 = findViewById(R.id.iv_8);
        iv9 = findViewById(R.id.iv_9);
        iv10 = findViewById(R.id.iv_10);
        iv11 = findViewById(R.id.iv_11);
        iv12 = findViewById(R.id.iv_12);
        iv13 = findViewById(R.id.iv_13);

        //Llamada al metodo desde cada boton
        iv1.setOnClickListener(new Clik());
        iv2.setOnClickListener(new Clik());
        iv3.setOnClickListener(new Clik());
        iv4.setOnClickListener(new Clik());
        iv5.setOnClickListener(new Clik());
        iv6.setOnClickListener(new Clik());
        iv7.setOnClickListener(new Clik());
        iv8.setOnClickListener(new Clik());
        iv9.setOnClickListener(new Clik());
        iv10.setOnClickListener(new Clik());
        iv11.setOnClickListener(new Clik());
        iv12.setOnClickListener(new Clik());
        iv13.setOnClickListener(new Clik());


    }

    public class Clik implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            Intent i;
            switch (v.getId()) {

                case R.id.iv_1:
                    i = new Intent(v.getContext(), EstimulosActivity.class);
                   // i.putExtra("imagen", "1");
                    i.putExtra("titulo", "Dialogó");
                    i.putExtra("descripcion", "Los integrantes de la comunidad educativa acuerdan generar los espacios de diálogo y participación como primera medida para la solución de conflictos");
                    i.putExtra("descripcion2", "Cantidad de conflictos atendidos y resueltos a través de estrategias de resolución pacífica de conflictos");
                    i.putExtra("descripcion3", "Semanalmente");

                    startActivity(i);

                    break;
                case R.id.iv_2:
                    i = new Intent(v.getContext(), EstimulosActivity.class);
                    i.putExtra("titulo", "Pertenencia");
                    i.putExtra("descripcion", "Fortalecer el sentido de pertenencia de los miembros de la comunidad hacia la Institución Educativa");
                    i.putExtra("descripcion2", "Incremento de participación estudiantil en eventos culturales, sociales, deportivos y otros, que desarrolla la IE");
                    i.putExtra("descripcion3", "Al finalizar cada actividad");
                    startActivity(i);
                    break;
                case R.id.iv_3:
                    i = new Intent(v.getContext(), EstimulosActivity.class);
                    i.putExtra("titulo", "Participación");
                    i.putExtra("descripcion", " Para el caso de los estudiantes motivándolos a la participación activa de los eventos programados por la IE y al buen porte del uniforme escolar designado");
                    i.putExtra("descripcion2", "Disminución de reportes por mal uso del uniforme.");
                    i.putExtra("descripcion3", "Semanalmente");
                    startActivity(i);
                    //Toast.makeText(getApplicationContext(), "hola 3", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.iv_4:
                    i = new Intent(v.getContext(), EstimulosActivity.class);
                    i.putExtra("titulo", "cumplimiento");
                    i.putExtra("descripcion", "Para el caso de los docentes cumplir con las disposiciones institucionales para el mejoramiento de sus funciones");
                    i.putExtra("descripcion2", "Motivación de los estudiantes ante las jornadas pedagógicas curriculares y extracurriculares");
                    i.putExtra("descripcion3", "Al finalizar cada periodo");
                    startActivity(i);
                    break;
                case R.id.iv_5:
                    i = new Intent(v.getContext(), EstimulosActivity.class);
                    i.putExtra("titulo", "Educación");
                    i.putExtra("descripcion", "Garantizar el goce efectivo del derecho a la educación de la población escolar, mediante");
                    i.putExtra("descripcion2", "Puntualidad en el cumplimiento de la jornada académica");
                    i.putExtra("descripcion3", "Diario");
                    startActivity(i);
                    break;
                case R.id.iv_6:
                    i = new Intent(v.getContext(), EstimulosActivity.class);
                    i.putExtra("titulo", "Tiempo y calidad ");
                    i.putExtra("descripcion", "El cumplimiento a cabalidad en tiempo y calidad de sus funciones pedagógicas, por parte de los docentes, personal de apoyo y administrativo");
                    i.putExtra("descripcion2", "Uso de estrategias pedagógicas participativas y activas ");
                    i.putExtra("descripcion3", "Diario");
                    startActivity(i);
                    break;
                case R.id.iv_7:
                    i = new Intent(v.getContext(), EstimulosActivity.class);
                    i.putExtra("titulo", "Eficiencia");
                    i.putExtra("descripcion", "Los estudiantes serán eficientes en sus actividades curriculares y extracurriculares");
                    i.putExtra("descripcion2", "Motivación y compromiso en el desarrollo de actividades curriculares y extracurriculares");
                    i.putExtra("descripcion3", "Diario");
                    startActivity(i);
                    break;
                case R.id.iv_8:
                    i = new Intent(v.getContext(), EstimulosActivity.class);
                    i.putExtra("titulo", "Apoyo");
                    i.putExtra("descripcion", "Los padres de familia, brindarán apoyo a sus hijos e hijas en su proceso formativo");
                    i.putExtra("descripcion2", "Mayor compromiso de padres de familia en el  apoyo y acompañamiento a sus hijos en sus labores escolares");
                    i.putExtra("descripcion3", "Diario");
                    startActivity(i);
                    break;
                case R.id.iv_9:
                    i = new Intent(v.getContext(), EstimulosActivity.class);
                    i.putExtra("titulo", "Cuidado");
                    i.putExtra("descripcion", "Dar buen uso y cuidar las instalaciones de la IE, en especial el mobiliario, equipos, enseres e infraestructura en general");
                    i.putExtra("descripcion2", "Disminución de reporte referidos al mal uso de los espacios de la IE,  equipos, muebles y enseres ");
                    i.putExtra("descripcion3", "Semanalmente");
                    startActivity(i);
                    break;
                case R.id.iv_10:
                    i = new Intent(v.getContext(), EstimulosActivity.class);
                    i.putExtra("titulo", "Bienestar");
                    i.putExtra("descripcion", "Generar acciones que conlleven al bienestar de cada uno de los integrantes de la comunidad educativa, promocionando el auto-cuidado, el respeto por el otro y la diversidad");
                    i.putExtra("descripcion2", "Implementación de Jornadas de promoción y prevención planeadas por el Comité de Convivencia Escolar");
                    i.putExtra("descripcion3", "Semanalmente");
                    startActivity(i);
                    break;
                case R.id.iv_11:
                    i = new Intent(v.getContext(), EstimulosActivity.class);
                    i.putExtra("titulo", "Difusión");
                    i.putExtra("descripcion", "Difundir en forma permanente los contenidos del Pacto de Convivencia a todos los integrantes de la comunidad educativa");
                    i.putExtra("descripcion2", "Incremento en el conocimiento de la Comunidad educativa respecto a los pactos de convivencia");
                    i.putExtra("descripcion3", "Al finalizar cada período");
                    startActivity(i);
                    break;
                case R.id.iv_12:
                    i = new Intent(v.getContext(), EstimulosActivity.class);
                    i.putExtra("titulo", "Derechos");
                    i.putExtra("descripcion", "Respetar y proteger los derechos de los y las escolares, identificando y notificando situaciones que vulneren su integridad personal y física");
                    i.putExtra("descripcion2", "Disminución de reporte de casos que afectan la integridad personal y física del estudiante.\n" +
                            "Casos atendidos y con reconociendo de los derechos del escolar\n");
                    i.putExtra("descripcion3", "Al finalizar cada período");
                    startActivity(i);
                    break;
                case R.id.iv_13:
                    i = new Intent(v.getContext(), EstimulosActivity.class);
                    i.putExtra("titulo", "Bienestar");
                    i.putExtra("descripcion", "Promover un ambiente limpio y saludable para el desarrollo de cualquier  acción escolar");
                    i.putExtra("descripcion2", "Incremento de espacios físico limpios donde interactúa la comunidad escolar");
                    i.putExtra("descripcion3", "Al finalizar jornada escolar");
                    startActivity(i);
                    break;
                default:
                    break;


            }
        }
    }
}