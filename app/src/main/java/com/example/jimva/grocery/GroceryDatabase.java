package com.example.jimva.grocery;

/**
 * Created by jimva on 11/1/2016.
 */


import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class GroceryDatabase  {
    MainActivity Parent;
    SQLiteDatabase mydatabase;

    public GroceryDatabase(MainActivity parent) {
        this.Parent = parent;
        mydatabase = Parent.openOrCreateDatabase("Grocery", Parent.MODE_PRIVATE, null);
    }

    public void DbHandler() {
        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS GroceryList(RecId INTEGER, ProId INTEGER, Amount VARCHAR);");
        mydatabase.execSQL("INSERT INTO GroceryList VALUES(1,1,'500');");
        Cursor resultSet = mydatabase.rawQuery("Select * from GroceryList",null);
        resultSet.moveToFirst();
        int RecId = resultSet.getInt(0);
        int ProId = resultSet.getInt(1);
        String Amount = resultSet.getString(2);
        System.out.println(RecId);
        System.out.println(ProId);
        System.out.println(Amount);
    }
}

