package com.fruittts.foorttune.uiqwe.wwwwb.udh;


import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {Enti.class},version = 1)
public abstract class Basetab extends RoomDatabase {
    public abstract Daotab daotab();
}
