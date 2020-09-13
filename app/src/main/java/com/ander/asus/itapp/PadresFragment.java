package com.ander.asus.itapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class PadresFragment extends Fragment {



    public PadresFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static PadresFragment newInstance() {
        PadresFragment fragment = new PadresFragment();

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
        return inflater.inflate(R.layout.fragment_padres, container, false);
    }
}