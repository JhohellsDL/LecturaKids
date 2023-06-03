package com.jdlstudios.lecturakids

import android.app.Application
import com.jdlstudios.lecturakids.data.AppDatabase
import com.jdlstudios.lecturakids.data.repositories.ReadingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class LecturaApplication : Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    private val database by lazy {
        AppDatabase.getDatabase(this, applicationScope)
    }

    val repository by lazy {
        ReadingRepository(database.readingDao())
    }
}