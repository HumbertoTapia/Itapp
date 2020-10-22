package com.ander.asus.itapp.institucional.fragmets;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ander.asus.itapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HimnoFragment extends Fragment {
    private TextView himno;


    public HimnoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_himno, container, false);

        himno= view.findViewById(R.id.tv_himno_id);
        himno.setText( Html.fromHtml( getString(R.string.detalle) ) );

        return inflater.inflate(R.layout.fragment_himno, container, false);


    }

}
