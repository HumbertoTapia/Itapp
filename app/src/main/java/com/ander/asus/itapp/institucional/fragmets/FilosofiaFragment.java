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
public class FilosofiaFragment extends Fragment {

    private TextView filosofia;



    public FilosofiaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_filosofia, container, false);

        filosofia= view.findViewById(R.id.tv_filosofia_id);
        filosofia.setText( Html.fromHtml( getString(R.string.detalle) ) );

        return inflater.inflate(R.layout.fragment_filosofia, container, false);








    }

}
