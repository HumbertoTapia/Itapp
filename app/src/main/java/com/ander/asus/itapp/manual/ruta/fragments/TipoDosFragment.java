package com.ander.asus.itapp.manual.ruta.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ander.asus.itapp.R;


public class TipoDosFragment extends Fragment implements View.OnClickListener {
    TextView tvTipoDos;


    public TipoDosFragment() {
        // Required empty public constructor
    }


    public static TipoDosFragment newInstance() {

        return new TipoDosFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tipo_dos, container, false);

        tvTipoDos = v.findViewById(R.id.tv_tipo_dos);
        tvTipoDos.setOnClickListener(this);
        return v;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_tipo_dos:
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        //.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right)
                        .replace(R.id.fl_menu, TipoDosDetalleFragment.newInstance())
                        .addToBackStack(null)
                        .commit();
                break;

        }

    }
}