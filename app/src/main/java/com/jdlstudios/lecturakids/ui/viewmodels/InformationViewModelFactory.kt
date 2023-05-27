package com.jdlstudios.lecturakids.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jdlstudios.lecturakids.data.AppDatabase
import com.jdlstudios.lecturakids.data.dao.ReadingDao

class InformationViewModelFactory(
    private val readingDao: ReadingDao
    ) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(InformationViewModel::class.java)) {
            return InformationViewModel(readingDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}