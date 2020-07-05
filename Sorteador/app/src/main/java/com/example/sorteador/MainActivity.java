package com.example.sorteador;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void sortearNumero(View View) {
        TextView textoResultado = findViewById(R.id.txtResultado);

        int numero = new Random().nextInt(101);

        textoResultado.setText("O número sorteado foi" + numero);


    }
}