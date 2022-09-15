package com.example.examen_sem_wcq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity implements View.OnClickListener {
    Button btnIniciarSesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        btnIniciarSesion=findViewById(R.id.btnIniciarSesion);
        btnIniciarSesion.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent iIniciarSesion=new Intent(Splash.this,Login.class);
        startActivity(iIniciarSesion);
    }
}