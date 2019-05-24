package com.example.devandroid.particular;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclickiniciosesion (View VistaRecibida){

        startActivity(new Intent(this, signup.class));
    }
    public void onclickregistro (View VistaRecibida){

        startActivity(new Intent(this, registro.class));
    }


}
