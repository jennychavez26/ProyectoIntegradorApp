package com.example.bottomnavwithnavigationcomponent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CitasActivity {



    public CitasActivity() {
        // Required empty public constructor
    }


    public View onCreateView(@org.jetbrains.annotations.NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_citas, container, false);
    }
}
