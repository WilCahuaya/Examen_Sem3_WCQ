package com.example.examen_sem_wcq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PreferenciasManual extends AppCompatActivity {
    EditText edtUsuario,edtPropfesor;
    Button btnRegistrar, btnRecuperar;
    String sUsuario,sProfesor;

    public static final String ARCHIVO_PREF="Preferencias_WCQ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencias_manual);

        edtUsuario=findViewById(R.id.edtUsuario);
        edtPropfesor=findViewById(R.id.edtProfesion);
        btnRegistrar=findViewById(R.id.btnRegistrarPreferencias);
        btnRecuperar=findViewById(R.id.btnRecuperarPreferencias);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sUsuario=edtUsuario.getText().toString();
                sProfesor=edtPropfesor.getText().toString();
                SharedPreferences preferences=getSharedPreferences(ARCHIVO_PREF,0);
                SharedPreferences.Editor editor= preferences.edit();
                editor.putString("usuario",sUsuario);
                editor.putString("profesion",sProfesor);
                editor.commit();
                Toast.makeText(PreferenciasManual.this,"Registros guardados",Toast.LENGTH_LONG).show();
            }
        });

        btnRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences=getSharedPreferences(ARCHIVO_PREF,0);
                sUsuario=preferences.getString("usuario","No registrado");
                sProfesor=preferences.getString("usuario","No registrado");
                Toast.makeText(PreferenciasManual.this,
                        "Los valores registrados son \n"+
                        sUsuario+"\n"+sProfesor,Toast.LENGTH_LONG).show();
            }
        });
    }
}