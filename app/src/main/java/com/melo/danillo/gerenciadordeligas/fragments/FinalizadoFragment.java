package com.melo.danillo.gerenciadordeligas.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.melo.danillo.gerenciadordeligas.R;


public class FinalizadoFragment extends Fragment {

    public static final String TITLE ="Finalizado";

    public static FinalizadoFragment newInstance(){
        return  new FinalizadoFragment();
    }

    public FinalizadoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     View  view = inflater.inflate(R.layout.fragment_finalizado, container, false);

        return view;
    }


}
