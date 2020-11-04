package com.ander.asus.itapp.test.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ander.asus.itapp.R;


public class TestTresFragment extends Fragment {


    public TestTresFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static TestTresFragment newInstance() {

        return new TestTresFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test_tres, container, false);
    }
}