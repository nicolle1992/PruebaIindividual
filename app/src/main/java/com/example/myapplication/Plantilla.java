package com.example.myapplication;

import android.provider.BaseColumns;

public class Plantilla {

    public static abstract class ProductoEntry implements BaseColumns {

        public static final String TABLE_NAME = "BAZAR";
        public static final String NOMBRE_PRODUCTO = "NOMBRE_PRODUCTO";
        public static final String PRECIO = "PRECIO";


    }
}