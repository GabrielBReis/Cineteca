package com.example.cineteca.Helper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;
import androidx.annotation.Nullable;
//import com.example.retrofit.FilmeActivity;

public class SQLiteDatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "my_database_2.db";
    private static final int DATABASE_VERSION = 5;
    public SQLiteDatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL("CREATE TABLE IF NOT EXISTS movie (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, titulo VARCHAR(1000), " +
                    "ano int)");



        } catch (Exception ex) {
            Log.i("INFO BD", "Erro na criação das tabelas   " + ex.getMessage());
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}