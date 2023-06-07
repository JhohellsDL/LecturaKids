package com.jdlstudios.lecturakids.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jdlstudios.lecturakids.data.dao.ReadingDao
import com.jdlstudios.lecturakids.data.entities.ReadingEntity
import kotlinx.coroutines.CoroutineScope

@Database(entities = [ReadingEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun readingDao(): ReadingDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(
            context: Context,
            scope: CoroutineScope
        ): AppDatabase {
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

    /*private class LecturaDatabaseCallback(
        private val scope: CoroutineScope
    ) : Callback() {

        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
            INSTANCE?.let {
                scope.launch {
                    populateDatabase(it.readingDao())
                }
            }
        }

        suspend fun populateDatabase(readingDao: ReadingDao) {
            //Delete all content
            readingDao.deleteAllReadings()

            //Add some reading
            val reading = ReadingEntity(
                title = "as",
                date = "asd",
                time = "00:56",
                answerCorrects = 4,
                level = 2,
                percentage = 75,
                score = 50
            )

            readingDao.insert(reading)
        }
    }*/
}
