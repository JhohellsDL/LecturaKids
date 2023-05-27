package com.jdlstudios.lecturakids.ui.viewmodels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jdlstudios.lecturakids.data.AppDatabase
import com.jdlstudios.lecturakids.data.dao.ReadingDao
import com.jdlstudios.lecturakids.data.entities.ReadingEntity
import com.jdlstudios.lecturakids.data.repositories.ReadingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class InformationViewModel(
    readingDao: ReadingDao
) : ViewModel() {

    private val repository: ReadingRepository = ReadingRepository(readingDao)

    private var allReadings: List<ReadingEntity> = listOf()

    //-----------------------------------para coroutinas------------------------------------------------
    private val viewModelJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)
    //--------------------------------------------------------------------------------------------------

    fun getList(){
        uiScope.launch {
            getListReadings()
        }
    }
    private suspend fun getListReadings(){
        viewModelScope.launch(Dispatchers.IO) {
            allReadings = repository.getAllReadings()
        }
    }

    fun insert(reading: ReadingEntity) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insert(reading)
        }
    }

    fun deleteAllReadings() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteAllReadings()
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}