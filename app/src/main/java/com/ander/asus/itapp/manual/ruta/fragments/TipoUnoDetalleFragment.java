package com.ander.asus.itapp.manual.ruta.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ander.asus.itapp.R;


public class TipoUnoDetalleFragment extends Fragment {



    public TipoUnoDetalleFragment() {
        // Required empty public constructor
    }


    public static TipoUnoDetalleFragment newInstance() {
        TipoUnoDetalleFragment fragment = new TipoUnoDetalleFragment();

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
        return inflater.inflate(R.layout.fragment_tipo_uno_detalle, container, false);
    }
}