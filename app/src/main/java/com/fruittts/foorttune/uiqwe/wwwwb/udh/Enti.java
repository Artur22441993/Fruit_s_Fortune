package com.fruittts.foorttune.uiqwe.wwwwb.udh;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "asas")
public class Enti {

    @ColumnInfo(name = "cont")
    public String cun;

    public Enti(String cun) {
        this.cun = cun;
    }


    @PrimaryKey(autoGenerate = true)
    int id;
}
