package com.example.hemant.firstpage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by hemant on 7/11/2016.
 */
public class Helper extends SQLiteOpenHelper {
    public static  String Dname="mydb1.db";
    public static final int Version=2;
    public Helper(Context context){super(context,Dname,null,Version);}
    public static final String Table_name="Cart";
    public static final String Dish="DISH";
    public static final String Rate="RATE";
    public static final String Quantity="QUNATITY";
    public static final String Value="VALUE";

    SQLiteDatabase mydb1;


    @Override
    public void onCreate(SQLiteDatabase db) {
        String queryTable="Create Table " +Table_name+ "(" +Dish+ " TEXT NOT NULL, " +
                Rate+ " REAL NOT NULL, " +
                Quantity+ " REAL NOT NULL, " +
                Value+ " REAL NOT NULL)";
        db.execSQL(queryTable);
    }
    public void openDb()
    {mydb1=getWritableDatabase();}
    public void closeDb()
    {if(mydb1!=null&&mydb1.isOpen()){
        mydb1.close();

    }}
    public long insert(String dish,int rate,int quantity,int value) {
        ContentValues values = new ContentValues();
        if (quantity > 0) {
            values.put(Dish, dish);
            values.put(Rate, rate);
            values.put(Quantity, quantity);
            values.put(Value, value);

        }

        return mydb1.insert(Table_name, null, values);



    }
    public long delete(String dish) {

        String where = Dish + " =  " + dish ;
        return mydb1.delete(Table_name, where, null);

    }





    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }
    public Cursor getAllRecords()
    {String query="Select * from "+Table_name;
        return mydb1.rawQuery(query,null);}



}