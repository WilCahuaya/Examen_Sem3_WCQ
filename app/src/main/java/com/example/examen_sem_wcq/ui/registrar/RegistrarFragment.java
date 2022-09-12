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

    EditText edtTitulo,edtAutor;
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
        edtTitulo=vista.findViewById(R.id.edtTitulo);
        edtAutor=vista.findViewById(R.id.edtAutor);
        btnRegistrar=vista.findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),edtTitulo.getText().toString()+"\n "+edtAutor.getText().toString(),Toast.LENGTH_SHORT).show();

            }
        });
        return vista;
    }
}