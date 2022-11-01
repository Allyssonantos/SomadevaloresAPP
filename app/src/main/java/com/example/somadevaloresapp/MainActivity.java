package com.example.somadevaloresapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void somarValores(View view) {
        // Recupera componentes
        EditText edValor1 = (EditText) findViewById(R.id.valor1);
        EditText edValor2 = (EditText) findViewById(R.id.valor2);

        // Recupera valores e faz a soma
        double valor1 = Double.parseDouble(edValor1.getText().toString());
        double valor2 = Double.parseDouble(edValor1.getText().toString());
        double resultado = valor1 + valor2;

        // Guarda resultado
        TextView txResultado = (TextView) findViewById(R.id.resultado);
        txResultado.setText("O valor da soma = " + resultado );

    }
}