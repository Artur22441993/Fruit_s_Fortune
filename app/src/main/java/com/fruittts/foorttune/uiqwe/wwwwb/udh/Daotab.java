package com.fruittts.foorttune.uiqwe.wwwwb.udh;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface Daotab {

    @Insert
    void ins(Enti enti);

    @Query("SELECT * FROM asas ORDER BY ID DESC LIMIT 1")
    Enti getEnti();

    @Query("SELECT COUNT (*) FROM asas")
    int getIntTab();
}
