package com.jdlstudios.lecturakids.data.repositories.provider

import com.jdlstudios.lecturakids.domain.models.ReadingItem

class ReadingBeginnerProvider {

    fun loadReadingBeginner(): List<ReadingItem> {
        return listOf(
            ReadingItem(
                id = 1,
                title = "Reading Beginner 1",
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
                title = "Reading Beginner 2",
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
                title = "Reading Beginner 3",
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