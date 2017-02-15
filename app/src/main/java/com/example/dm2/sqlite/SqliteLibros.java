package com.example.dm2.sqlite;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class SqliteLibros extends SQLiteOpenHelper {
    String crearTabla="create table libros (id INTEGER PRIMARY KEY AUTOINCREMENT,titulo TEXT,autor TEXT)";

    public SqliteLibros(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(crearTabla);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //se elimina la version anterior de la tabla
        db.execSQL("drop table if exists libros");

        db.execSQL(crearTabla);
    }
}