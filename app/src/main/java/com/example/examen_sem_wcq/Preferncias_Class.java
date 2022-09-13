package com.example.examen_sem_wcq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.widget.Toast;

public class Preferncias_Class extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias_class);

        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        boolean dat1=preferences.getBoolean("mantener_sesion",true);
        String dat1s;
        String dat2=preferences.getString("nombre_usuario","No registrado");
        if(dat1==true) {
            Intent i=new Intent(Preferncias_Class.this,MainActivity.class);
            startActivity(i);
        }else {
            Intent i=new Intent(Preferncias_Class.this,Login.class);
            startActivity(i);
        };
    }
}