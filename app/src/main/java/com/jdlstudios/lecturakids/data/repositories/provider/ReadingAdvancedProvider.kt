package com.jdlstudios.lecturakids.data.repositories.provider

import com.jdlstudios.lecturakids.domain.models.ReadingItem

class ReadingAdvancedProvider {
    fun loadReadingAdvanced(): List<ReadingItem> {
        return listOf(
            ReadingItem(
                id = 1,
                title = "Reading Advanced 1",
                reading = "Content of reading 1",
                questions = listOf(
                    "question 1",
                    "question 2",
                    "question 3",
                    "question 4"
                )
            ),
            ReadingItem(
                id = 2,
                title = "Reading Advanced 2",
                reading = "Content of reading 2",
                questions = listOf(
                    "question 1",
                    "question 2",
                    "question 3",
                    "question 4"
                )
            ),
            ReadingItem(
                id = 3,
                title = "Reading Advanced 3",
                reading = "Content of reading 3",
                questions = listOf(
                    "question 1",
                    "question 2",
                    "question 3",
                    "question 4"
                )
            )
        )
    }
}