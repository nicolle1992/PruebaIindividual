package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class CRUD {
    private BaseDatosSQL Bdatos;
    private SQLiteDatabase db;
    private ContentValues values = new ContentValues();

    public CRUD(Context context) {
        Bdatos = new BaseDatosSQL(context);
    }

    public CRUD() {

    }

    public void insertar(Producto n) {
        db = Bdatos.getWritableDatabase();
        values.clear();
        values.put(Plantilla.ProductoEntry.NOMBRE_PRODUCTO, n.getNombre());
        values.put(Plantilla.ProductoEntry.PRECIO, n.getPrecio());
        db.insert(Plantilla.ProductoEntry.TABLE_NAME, null, values);
        //  db.close();
    }

    public void modificar(Producto n) {
        db = Bdatos.getWritableDatabase();
        values.clear();
        values.put(Plantilla.ProductoEntry.NOMBRE_PRODUCTO, n.getNombre());
        values.put(Plantilla.ProductoEntry.PRECIO, n.getPrecio());
        String[] args = new String[]{n.getNombre()};
        db.update(Plantilla.ProductoEntry.TABLE_NAME, values, Plantilla.ProductoEntry.NOMBRE_PRODUCTO + "=?", args);
        // db.close();
    }  // Fin Metodo Modificar

    public void borrar(String n) {
        db = Bdatos.getWritableDatabase();
        String[] args1 = new String[]{n};
        db.delete(Plantilla.ProductoEntry.TABLE_NAME, Plantilla.ProductoEntry.NOMBRE_PRODUCTO + "=?", args1);
    }  //  Fin Metodo Borrar
}
