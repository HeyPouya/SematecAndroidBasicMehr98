package com.sematec.sematecandroidbasicmehr98;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SqliteHelper extends SQLiteOpenHelper {

    String TABLE_NAME = "students";

    public SqliteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_QUERY = "CREATE TABLE " + TABLE_NAME + "("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "name TEXT,"
                + "family TEXT,"
                + "grade INTEGER"
                + ")";
        db.execSQL(CREATE_TABLE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public void insertStudent(String name, String family, int grade) {

        String INSERT_STUDENT_QUERY = "INSERT INTO " + TABLE_NAME + "(name,family,grade) VALUES("
                + "'" + name + "'" + ","
                + "'" + family + "'" + ","
                + grade
                + ")";

        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(INSERT_STUDENT_QUERY);
        db.close();
    }


    public String getAllStudentsName() {
        String result = "";
        String GET_ALL_STUDENTS_NAME_QUERY = "SELECT name FROM " + TABLE_NAME;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor data = db.rawQuery(GET_ALL_STUDENTS_NAME_QUERY, null);

        while (data.moveToNext()){
            result = result + data.getString(0) + "\n";
        }

        db.close();

        return result;
    }
}
