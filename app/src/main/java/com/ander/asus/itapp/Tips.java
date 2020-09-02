package com.ander.asus.itapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Tips extends AppCompatActivity {

    ArrayList<TipsVo> listaTips;
    RecyclerView recyclerTips;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        listaTips= new ArrayList<>();
        recyclerTips= findViewById(R.id.id_recycler_tips);
        recyclerTips.setLayoutManager(new LinearLayoutManager(this));
        llenarTips();
        AdaptadorTips adapter =new AdaptadorTips(listaTips);
        recyclerTips.setAdapter(adapter);
    }


    private void llenarTips() {
        listaTips.add(new TipsVo("Las cosas se solucionan conversándolas:","En un curso existen distintas personas, todas con distintos intereses, gustos y preocupaciones y por lo mismo, es importante que siempre haya comunicación.", R.drawable.img1));
        listaTips.add(new TipsVo("Siempre debe haber respeto:","Independiente de cuán grande pueda ser una discusión, siempre debe existir un elemento presente, el respeto, y la mejor forma de enseñarlo es con el ejemplo.", R.drawable.img2));
        listaTips.add(new TipsVo("En lo preferible, hay que evitar las discusiones:","Para solucionar los problemas se puede hablar para intentar resolverlos o, por el contrario, discutir. Siempre es preferible conversarlos, ya que una discusión fuerte siempre afecta y altera a toda una comunidad.", R.drawable.img3));
        listaTips.add(new TipsVo("Saber disculparse","Siempre es más fácil externalizar las culpas o no hacer anda al respecto, por lo mismo el fomentar ésta práctica ayuda a concientizar a una comunidad sobre sus errores y problemas y así mejorarlos.", R.drawable.img4));
        listaTips.add(new TipsVo("Celebrar juntos los éxitos:","En todas las comunidades siempre hay elementos destacables y logros en conjunto e individuales. Recalcar lo positivo siempre ayuda a tener un ambiente más alegre y agradable, además de fortalecer el sentido de pertenencia de los integrantes y el orgullo por la consecución de éxitos.", R.drawable.img5));



    }


}
