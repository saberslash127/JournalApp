package com.bustamante.journalapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;


//public class Database extends SQLiteOpenHelper
//{

//    private static final int    DATABASE_VERSION    = 2;
//    private static final String DATABASE_NAME       = "Entry.db";
//    private static final String TABLE_TITLE        = "entry";
//    private static final String COLUMN_CONTENT    = "entry_content";
 //   private static final String COLUMN_BILL_AMOUNT  = "bill_amount";



//    public Database(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
 //       super(context, DATABASE_NAME, factory, DATABASE_VERSION);
 //   }

//    @Override
 //   public void onCreate(SQLiteDatabase sqLiteDatabase) {
//        String query =
//                //"CREATE TABLE " + TABLE_TIPS + "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_BILL_DATE + " INTEGER, " + COLUMN_BILL_AMOUNT + " REAL, " + COLUMN_TIP_PERCENT + " REAL" + ");";
//       sqLiteDatabase.execSQL(query);
//    }

//}
