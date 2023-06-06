package com.jdlstudios.lecturakids.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jdlstudios.lecturakids.data.entities.ReadingEntity
import com.jdlstudios.lecturakids.data.repositories.ReadingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class InformationViewModel(
    private val repository: ReadingRepository
) : ViewModel() {

    private var _allReadings = MutableLiveData<List<ReadingEntity>>()
    val allReadings: LiveData<List<ReadingEntity>>
        get() = _allReadings

    //-----------------------------------para coroutinas------------------------------------------------
    private val viewModelJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)
    //--------------------------------------------------------------------------------------------------

    init {
        getList()
    }

    fun getList() {
        uiScope.launch {
            repository.getAllReadings().let {
                _allReadings.value = it.reversed()
            }
        }
    }

    /*private suspend fun getListReadings() {
        viewModelScope.launch {
            allReadings = repository.getAllReadings()
        }
    }*/

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