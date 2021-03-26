package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatosSQL extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Productos.db";

    private BaseDatosSQL datos;
    private SQLiteDatabase db;

    public BaseDatosSQL(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + Plantilla.ProductoEntry.TABLE_NAME + " ("

                + Plantilla.ProductoEntry.NOMBRE_PRODUCTO + " TEXT NOT NULL,"
                + Plantilla.ProductoEntry.PRECIO + " INTERGER NOT NULL)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

}
