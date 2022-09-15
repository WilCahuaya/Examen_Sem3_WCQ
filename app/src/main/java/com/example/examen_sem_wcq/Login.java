package com.example.examen_sem_wcq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener{
    EditText edtCorreo,edtPassword;
    Button btnIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtCorreo=findViewById(R.id.edtCorreo);
        edtPassword=findViewById(R.id.edtPassword);
        btnIngresar=findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String sCorreo=edtCorreo.getText().toString();
        String sPassword=edtPassword.getText().toString();
        if("wcahuayaquispe@gmail.com".equals(sCorreo) && "123".equals(sPassword)){
            Intent i=new Intent(this,MainActivity.class);
            startActivity(i);
        }else{
            Toast.makeText(this,"Correo o contraseña incorrecta", Toast.LENGTH_SHORT).show();
        }
    }
}