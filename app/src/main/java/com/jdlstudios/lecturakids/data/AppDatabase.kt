package com.jdlstudios.lecturakids.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jdlstudios.lecturakids.data.dao.ReadingDao
import com.jdlstudios.lecturakids.data.entities.ReadingEntity

@Database(entities = [ReadingEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun readingDao() : ReadingDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "app_database"
                    ).build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}
