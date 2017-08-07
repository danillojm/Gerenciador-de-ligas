package com.melo.danillo.gerenciadordeligas.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.melo.danillo.gerenciadordeligas.R;



public class MeuClubeFragment extends Fragment {

   public static final String TITLE ="Meu clube";

    public static MeuClubeFragment newInstance(){
        return  new MeuClubeFragment();
    }

    public MeuClubeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View  view = inflater.inflate(R.layout.fragment_meu_clube, container, false);
        return view;
    }

}
