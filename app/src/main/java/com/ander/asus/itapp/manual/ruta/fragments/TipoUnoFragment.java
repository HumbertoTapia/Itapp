package com.ander.asus.itapp.manual.ruta.fragments;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ander.asus.itapp.R;

import org.w3c.dom.Text;


public class TipoUnoFragment extends Fragment implements View.OnClickListener {
 CardView cvGestorPaz, cvDirectorGrado, cvComiteEscolar;
 TextView tvTipoUno;
 Context context;


    public TipoUnoFragment() {
        // Required empty public constructor
    }


    public static TipoUnoFragment newInstance() {

        return new TipoUnoFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tipo_uno, container, false);

        cvGestorPaz = v.findViewById(R.id.cv_gestor_de_paz);
        cvDirectorGrado=v.findViewById(R.id.cv_director_grado);
        cvComiteEscolar=v.findViewById(R.id.cv_comite_escolar);
        tvTipoUno=v.findViewById(R.id.tv_tipo_uno);
        cvGestorPaz.setOnClickListener(this);
        cvDirectorGrado.setOnClickListener(this);
        cvComiteEscolar.setOnClickListener(this);
        tvTipoUno.setOnClickListener(this);
       /* cvGestorPaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        //.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right)
                        .replace(R.id.fl_menu, TipoUnoGestoresFragment.newInstance())
                        .addToBackStack(null)
                        .commit();
            }
        });

        */

       
        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cv_gestor_de_paz:
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        //.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right)
                        .replace(R.id.fl_menu, TipoUnoGestoresFragment.newInstance())
                        .addToBackStack(null)
                        .commit();
                break;
            case R.id.cv_director_grado:
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        //.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right)
                        .replace(R.id.fl_menu, TipoUnoFragmentDirector.newInstance())
                        .addToBackStack(null)
                        .commit();
                break;

            case R.id.cv_comite_escolar:
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        //.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right)
                        .replace(R.id.fl_menu, TipoUnoComiteEscolarFragment.newInstance())
                        .addToBackStack(null)
                        .commit();
                break;
            case R.id.tv_tipo_uno:
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        //.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right)
                        .replace(R.id.fl_menu, TipoUnoDetalleFragment.newInstance())
                        .addToBackStack(null)
                        .commit();
                break;
        }
    }
}