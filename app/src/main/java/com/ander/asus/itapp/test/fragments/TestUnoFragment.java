package com.ander.asus.itapp.test.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ander.asus.itapp.R;


public class TestUnoFragment extends Fragment {



    public TestUnoFragment() {
        // Required empty public constructor
    }


    public static TestUnoFragment newInstance() {

        return new TestUnoFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_test_uno, container, false);


       Button btnSiguiente1 = v.findViewById(R.id.bt_siguiente1);

       btnSiguiente1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        //.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right)
                        .replace(R.id.fl_test, TestDosFragment.newInstance())
                        .addToBackStack(null)
                        .commit();
            }
        });

        return v;
    }
}