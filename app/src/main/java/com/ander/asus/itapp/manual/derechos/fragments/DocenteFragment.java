package com.ander.asus.itapp.manual.derechos.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ander.asus.itapp.R;


public class DocenteFragment extends Fragment {



    public DocenteFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static DocenteFragment newInstance() {
        DocenteFragment fragment = new DocenteFragment();

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
        return inflater.inflate(R.layout.fragment_docente, container, false);
    }
}