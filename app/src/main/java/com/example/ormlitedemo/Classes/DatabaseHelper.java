package com.example.ormlitedemo.Classes;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.example.ormlitedemo.R;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.query.Not;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private final static String DATABASE_NAME = "notes.db"; //create variable for database name in capitalize
    private final static int DATABASE_VERSION = 1; //create variable for database version

    private Dao<Note, Integer> noteDao = null; //create DAO(Database Access Object) for Note.class
    private RuntimeExceptionDao<Note, Integer> noteRuntimeExceptionDao = null; //create DAO(Database Access Object) RuntimeException for Note.class

    public DatabaseHelper(Context context) {
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
        super(context, DATABASE_NAME, null, DATABASE_VERSION, R.raw.ormlite_config);//R will code later | create folder for "raw"
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase,
                         ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Note.class);  //Create table for Note class
        } catch (SQLException | java.sql.SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource,
                          int oldVersion, int newVersion) {
        try {

            TableUtils.dropTable(connectionSource, Note.class, true);//Drop table Note if exist
            onCreate(database, connectionSource);//Method to create method
        } catch (SQLException | java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
    //create method Dao for getNoteDao
    public Dao<Note,Integer> getNoteDao()throws java.sql.SQLException{
        if(noteDao == null){
            noteDao = getDao(Note.class);
        }
        return noteDao;
    }
    //create method RuntimeExceptionDao getNoteDao
    public RuntimeExceptionDao<Note,Integer> getNoteRuntimeExceptionDao(){
        if(noteRuntimeExceptionDao == null){ //create condition for noteRuntimeExceptionDao
            noteRuntimeExceptionDao = getRuntimeExceptionDao(Note.class);
        }
        return noteRuntimeExceptionDao;
    }
}
