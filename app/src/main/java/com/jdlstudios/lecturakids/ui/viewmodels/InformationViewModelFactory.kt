package com.jdlstudios.lecturakids.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jdlstudios.lecturakids.data.AppDatabase
import com.jdlstudios.lecturakids.data.dao.ReadingDao
import com.jdlstudios.lecturakids.data.repositories.ReadingRepository

@Suppress("UNCHECKED_CAST")
class InformationViewModelFactory(
    private val repository: ReadingRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(InformationViewModel::class.java)) {
            return InformationViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}