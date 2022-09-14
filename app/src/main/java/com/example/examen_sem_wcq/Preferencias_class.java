package com.example.examen_sem_wcq;

import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.View;
import android.widget.Toast;

import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class Preferencias_class extends PreferenceActivity {
    boolean dat1=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferen_class);

        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        dat1=preferences.getBoolean("mantener_sesion",true);
        String dat2=preferences.getString("nombre_usuario","No registrado");

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                if(dat1==true) {
                    Intent i=new Intent(Preferencias_class.this,MainActivity.class);
                    startActivity(i);
                }else {
                    Intent i=new Intent(Preferencias_class.this,Login.class);
                    startActivity(i);
                };
            }
        },3000);

    }

}