package com.app.calculadora1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnSuma,btnResta,btnDivision,btnMultiplicacion;
    EditText txtNum1, txtNum2;
    Integer Resultado, Num1,Num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnResta = (Button) findViewById(R.id.btnResta);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultiplicacion = (Button) findViewById(R.id.btnMultiplicacion);
        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.textNum2);

        Num1 = Integer.parseInt(txtNum1.getText().toString());
        Num2 = Integer.parseInt(txtNum2.getText().toString());

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resultado = Num1 + Num2;
            }
        });
    }
}