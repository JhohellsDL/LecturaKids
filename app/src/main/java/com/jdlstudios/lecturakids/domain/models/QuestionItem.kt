package com.jdlstudios.lecturakids.domain.models

data class QuestionItem(
    val question: String = "",
    val options: List<String> = listOf()
)
