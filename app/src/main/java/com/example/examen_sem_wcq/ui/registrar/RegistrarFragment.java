package com.example.examen_sem_wcq.ui.registrar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.examen_sem_wcq.R;


public class RegistrarFragment extends Fragment {

    EditText edtProfesion,edtDirteccion;
    Button btnRegistrar;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista =inflater.inflate(R.layout.fragment_registrar, container, false);
        edtProfesion=vista.findViewById(R.id.edtProfesion);
        edtDirteccion=vista.findViewById(R.id.edtDireccion);
        btnRegistrar=vista.findViewById(R.id.btnRegitraTransf);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sProfesion=edtProfesion.getText().toString();
                String sDireccion=edtDirteccion.getText().toString();

                if("".equals(sProfesion)){
                    edtProfesion.setError("Ingresa Profesión");
                    edtProfesion.requestFocus();
                }

                if("".equals(sDireccion)){
                    edtDirteccion.setError("Ingresa Die=rección");
                    edtDirteccion.requestFocus();
                }

            }
        });
        return vista;
    }
}