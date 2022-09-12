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
    Button btnRegistrar;
    String sUsuario,sProfesor;

    public static final String ARCHIVO_PREF="Preferencias_WCQ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencias_manual);

        edtUsuario=findViewById(R.id.edtUsuario);
        edtPropfesor=findViewById(R.id.edtProfesion);
        btnRegistrar=findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sUsuario=edtUsuario.getText().toString();
                sProfesor=edtPropfesor.getText().toString();
                SharedPreferences preferences=getSharedPreferences(ARCHIVO_PREF,0);
                SharedPreferences.Editor editor= preferences.edit();
                editor.putString("usuario",sUsuario);
                editor.putString("PROFESION",sProfesor);
                editor.commit();
                Toast.makeText(PreferenciasManual.this,"Registros guardados",Toast.LENGTH_LONG).show();
            }
        });
    }
}