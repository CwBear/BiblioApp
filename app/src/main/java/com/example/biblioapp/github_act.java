package com.example.biblioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Clases.Valor;
public class github_act extends AppCompatActivity {

    private Spinner spin1;
    private TextView tv;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);
        spin1 = (Spinner) findViewById(R.id.snpLibros);
        tv = (TextView) findViewById(R.id.snpLibros);

        ArrayList<String> ListaLibros = (ArrayList<String>) getIntent().getSerializableExtra("ListaLibros");

        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ListaLibros);

        spin1.setAdapter(adapt);
    }
    public void Mostrar(View v)
    {
        String opcion = spin1.getSelectedItem().toString(); // guardo los datos en una opcion
        Valor valor = new Valor();


        if(opcion.equals("Farenheith"))
        {
            tv.setText("Has seleccionado Farenheit y el Valor es: "+valor.getValorFarenheith());
        }
        if(opcion.equals("Revival"))
        {
            tv.setText("Has seleccionado Revival y el Valor es: "+valor.getValorRevival());
        }
        if(opcion.equals("El Alquimista"))
        {
            tv.setText("Has seleccionado El Alquimista y el Valor es: "+valor.getValorElalquimista());
        }
        if(opcion.equals("El Poder"))
        {
            tv.setText("Has seleccionado El Poder y el Valor es: "+valor.getValorElPoder());
        }
        if(opcion.equals("Despertar"))
        {
            tv.setText("Has seleccionado El Alquimista y el Valor es: "+valor.getValorDespertar());
        }

    }

}