package com.ander.asus.itapp.manual.derechos.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ander.asus.itapp.R;


public class EstudianteFragment extends Fragment {



    public EstudianteFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static EstudianteFragment newInstance() {
        EstudianteFragment fragment = new EstudianteFragment();

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
        return inflater.inflate(R.layout.fragment_estudiante, container, false);
    }



}