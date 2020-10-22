package com.ander.asus.itapp.manual.ruta.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ander.asus.itapp.R;


public class TipoUnoComiteEscolarFragment extends Fragment {



    public TipoUnoComiteEscolarFragment() {
        // Required empty public constructor
    }


    public static TipoUnoComiteEscolarFragment newInstance() {
        TipoUnoComiteEscolarFragment fragment = new TipoUnoComiteEscolarFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tipo_uno_comite_escolar, container, false);
    }
}