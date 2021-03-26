package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etnombre, etprecio;
    Button grabar, modificar, eliminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnombre = (EditText) findViewById(R.id.etnombre);
        etprecio = (EditText) findViewById(R.id.etprecio);
        grabar = (Button) findViewById(R.id.grabar);
        modificar = (Button) findViewById(R.id.modificar);
        eliminar = (Button) findViewById(R.id.eliminar);

        grabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Producto prod = new Producto();
                CRUD lele = new CRUD(getApplicationContext());
                prod.setNombre(etnombre.getText().toString());
                prod.setPrecio(Integer.parseInt(etprecio.getText().toString()));
                lele.insertar(prod);
            }
        }); // fin BOTON Insertar
        modificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Producto prod = new Producto();
                CRUD lele = new CRUD(getApplicationContext());
                prod.setNombre(etnombre.getText().toString());
                prod.setPrecio(Integer.parseInt(etprecio.getText().toString()));
                lele.modificar(prod);
            }
        });  // Fin BOTON Modificar

        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a;
                CRUD lele = new CRUD(getApplicationContext());
                a = etnombre.getText().toString();
                lele.borrar(a);
            }
        });  // Fin BOTON Borrar


    } // fin del metodo oncreate
}// fin de la clase