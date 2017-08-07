package com.melo.danillo.gerenciadordeligas.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.melo.danillo.gerenciadordeligas.R;



public class MinhasLigasFragment extends Fragment {

    public static final String TITLE ="MINHAS LIGAS";

    public static MinhasLigasFragment newInstance(){
        return  new MinhasLigasFragment();
    }

    public MinhasLigasFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_minhas_ligas, container, false);

        FloatingActionButton fab = (FloatingActionButton)   view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    return  view;
    }


public void t(){



}



}
