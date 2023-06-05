package com.jdlstudios.lecturakids.data.repositories.provider

import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.domain.models.QuestionItem
import com.jdlstudios.lecturakids.domain.models.ReadingItem

class ReadingBeginnerProvider {

    fun loadReadingBeginner(): List<ReadingItem> {
        return listOf(
            ReadingItem(
                id = 1,
                title = "Reading Beginner 1",
                reading = "Content of reading 1 testetstestetse",
                questions = listOf(
                    QuestionItem(
                        question = "pregunta Beginner 1 a",
                        options = listOf(
                            "question 1.1.1",
                            "question 1.1.2",
                            "question 1.1.3",
                            "question 1.1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Beginner 2 a",
                        options = listOf(
                            "question 2.1.1",
                            "question 2.1.2",
                            "question 2.1.3",
                            "question 2.1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Beginner 3 a",
                        options = listOf(
                            "question 3.1.1",
                            "question 3.1.2",
                            "question 3.1.3",
                            "question 3.1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Beginner 4 a",
                        options = listOf(
                            "question 4.1.1",
                            "question 4.1.2",
                            "question 4.1.3",
                            "question 4.1.4"
                        ),
                    )
                ),
                image = R.drawable.libro_de_lectura
            ),
            ReadingItem(
                id = 2,
                title = "Reading Beginner 2",
                reading = "Content of reading 2",
                questions = listOf(
                    QuestionItem(
                        question = "pregunta Beginner 1",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Beginner 2",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Beginner 3",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Beginner 4",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    )
                ),
                image = R.drawable.libro_de_lectura
            ),
            ReadingItem(
                id = 3,
                title = "Reading Beginner 3",
                reading = "Content of reading 3",
                questions = listOf(
                    QuestionItem(
                        question = "pregunta Beginner 1",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Beginner 2",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Beginner 3",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Beginner 4",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    )
                ),
                image = R.drawable.libro_de_lectura
            ),
        )
    }
}