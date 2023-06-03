package com.jdlstudios.lecturakids.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.jdlstudios.lecturakids.data.dao.ReadingDao
import com.jdlstudios.lecturakids.data.entities.ReadingEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

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
                    ).addCallback(LecturaDatabaseCallback(scope))
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }

    private class LecturaDatabaseCallback(
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
                time = 56,
                answerCorrects = 4,
                score = 50
            )

            readingDao.insert(reading)
        }
    }
}
