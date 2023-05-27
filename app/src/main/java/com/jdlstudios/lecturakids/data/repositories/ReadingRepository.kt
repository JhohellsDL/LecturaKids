package com.jdlstudios.lecturakids.data.repositories

import com.jdlstudios.lecturakids.data.dao.ReadingDao
import com.jdlstudios.lecturakids.data.entities.ReadingEntity

class ReadingRepository(private val readingDao: ReadingDao) {

    suspend fun getAllReadings(): List<ReadingEntity> {
        return readingDao.getAllReadings()
    }

    suspend fun insert(reading: ReadingEntity) {
        readingDao.insert(reading)
    }

    suspend fun deleteAllReadings() {
        readingDao.deleteAllReadings()
    }
}