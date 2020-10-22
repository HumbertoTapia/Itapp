package com.ander.asus.itapp.manual.ruta.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ander.asus.itapp.R;


public class TipoTresDetalleFragment extends Fragment{



    public TipoTresDetalleFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static TipoTresDetalleFragment newInstance() {

        return new TipoTresDetalleFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tipo_tres_detalle, container, false);

        return v;
    }


}