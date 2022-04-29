package com.kelompok8.reportapps.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.kelompok8.reportapps.dao.DatabaseDao;
import com.kelompok8.reportapps.model.ModelDatabase;



@Database(entities = {ModelDatabase.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}
