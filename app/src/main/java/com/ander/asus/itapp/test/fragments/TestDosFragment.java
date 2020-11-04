package com.ander.asus.itapp.test.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ander.asus.itapp.R;


public class TestDosFragment extends Fragment {


    private String mParam2;

    public TestDosFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static TestDosFragment newInstance() {

        return new TestDosFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test_dos, container, false);
    }
}