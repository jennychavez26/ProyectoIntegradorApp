package com.example.bottomnavwithnavigationcomponent;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void registro(View view){
        setContentView(R.layout.activity_registro);
    }

    public void iniciar(View view){
        setContentView(R.layout.activity_main);
    }

}
