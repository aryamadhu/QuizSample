package com.example.aryam.quizsample.model;

import android.content.Context;
import android.database.Cursor;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by arya.m on 10/5/2016.
 */
public class QuzDbWrapper {
    static final String TABLE_QUESTION= "Questiontbl";
    QuzDb qdb;

    public boolean openLocalDb(Context ctx){
        boolean dbcreated=true;
        qdb= new QuzDb(ctx);
        try {
            qdb.createDataBase();
            qdb.openDataBase();
        }
        catch (IOException e ){
            dbcreated= false;
        }
        catch (SQLException sqle){
            dbcreated=false;
        }
        return dbcreated;
    }
    public void closeLocalDb(){
        if(qdb!=null){
            qdb.close();
        }
    }

    public Cursor readAllData(){
        return qdb.readAllRecords(TABLE_QUESTION, null);
    }


}
