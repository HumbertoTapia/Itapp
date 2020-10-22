package com.ander.asus.itapp.manual.ruta.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ander.asus.itapp.R;


public class TipoDosDetalleFragment extends Fragment implements View.OnClickListener {





    public TipoDosDetalleFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static TipoDosDetalleFragment newInstance() {
        TipoDosDetalleFragment fragment = new TipoDosDetalleFragment();

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
        return inflater.inflate(R.layout.fragment_tipo_dos_detalle, container, false);
    }

    @Override
    public void onClick(View v) {

    }
}