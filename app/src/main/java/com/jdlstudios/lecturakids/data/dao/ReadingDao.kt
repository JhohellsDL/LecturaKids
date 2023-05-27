package com.jdlstudios.lecturakids.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.jdlstudios.lecturakids.data.entities.ReadingEntity

@Dao
interface ReadingDao {
    @Insert
    suspend fun insert(reading: ReadingEntity)

    @Query("SELECT * FROM readings")
    suspend fun getAllReadings(): List<ReadingEntity>

    @Query("DELETE FROM readings")
    suspend fun deleteAllReadings()
}

