package com.app.calculadora1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Resultado_Activity extends AppCompatActivity {

    EditText resultado;
    String resul;
    //Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        resultado = (EditText) findViewById(R.id.txtResultado);


        resul = getIntent().getStringExtra("Resultado");

        resultado.setText(resul);

    }
}