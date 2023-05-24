package com.jdlstudios.lecturakids.domain.models

data class ReadingItem(
    val id: Int = 0,
    val title: String = "",
    val reading: String = "",
    val questions: List<String> = listOf()
)
