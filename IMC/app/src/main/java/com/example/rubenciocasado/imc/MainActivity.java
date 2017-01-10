package com.example.rubenciocasado.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaramos variables y elementos
    EditText edPeso;
    EditText edAltura;
    TextView edResultado;
    Button btnCalcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referenciamos elementos XML
        edPeso = (EditText) findViewById(R.id.edPeso);
        edAltura = (EditText) findViewById(R.id.edAltura);
        edResultado = (TextView) findViewById(R.id.edResultado);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        //Asociar al botón un listener para que el botón pueda accionar.
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Definir valores para calcular el IMC
                double peso;
                double altura;
                double IMC;

                //Cambiar el valor a String
                peso = Double.parseDouble(edPeso.getText().toString());
                altura = Double.parseDouble(edAltura.getText().toString());

                //el  IMC es el resultado de dividir el peso entre la altura al cuadrado.
                IMC = peso/Math.pow(altura,2); //pow es para hacer el cuadrado.

                //Sacar resultado concatenando lo que tiene la cadena con el valor que ponemos.
                edResultado.setText("" + IMC);


            }
        });



    }
}
