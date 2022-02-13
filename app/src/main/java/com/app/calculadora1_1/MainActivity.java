package com.app.calculadora1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String RESULTADO ="Resultado";
    Button btnSuma,btnResta,btnDivision,btnMultiplicacion;
    EditText txtNum1, txtNum2;
    Integer Resultado, Num1,Num2;
    String dato;

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

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Suma();
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resta();
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Division();
            }
        });

        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Multiplicar();
            }
        });
    }

    public void Suma(){
        Num1 = Integer.parseInt(txtNum1.getText().toString());
        Num2 = Integer.parseInt(txtNum2.getText().toString());
        Resultado = Num1 + Num2;
        dato = "Resultado " + Resultado;

        Intent  next = new Intent(this,Resultado_Activity.class);
        next.putExtra("Resultado",dato);
        startActivity(next);
        limpiar();
    }

    public void Resta(){
        Num1 = Integer.parseInt(txtNum1.getText().toString());
        Num2 = Integer.parseInt(txtNum2.getText().toString());
        Resultado = Num1 - Num2;
        dato = "Resultado " + Resultado;

        Intent  next = new Intent(this,Resultado_Activity.class);
        next.putExtra("Resultado",dato);
        startActivity(next);
        limpiar();
    }

    public void Division(){
        Num1 = Integer.parseInt(txtNum1.getText().toString());
        Num2 = Integer.parseInt(txtNum2.getText().toString());
        if (Num2 == 0){
            Toast.makeText(this, "No se puede dividir entre 0", Toast.LENGTH_LONG).show();
        }else{
        Resultado = Num1 / Num2;
        dato = "Resultado " + Resultado;

        Intent  next = new Intent(this,Resultado_Activity.class);
        next.putExtra("Resultado",dato);
        startActivity(next);
        limpiar();
        }
    }

    public void Multiplicar(){
        Num1 = Integer.parseInt(txtNum1.getText().toString());
        Num2 = Integer.parseInt(txtNum2.getText().toString());
        Resultado = Num1 * Num2;
        dato = "Resultado " + Resultado;

        Intent  next = new Intent(this,Resultado_Activity.class);
        next.putExtra("Resultado",dato);
        startActivity(next);
        limpiar();
    }

    public void limpiar(){
        txtNum1.setText("");
        txtNum2.setText("");
    }
}