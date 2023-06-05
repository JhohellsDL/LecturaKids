package com.jdlstudios.lecturakids.data.repositories.provider

import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.domain.models.QuestionItem
import com.jdlstudios.lecturakids.domain.models.ReadingItem

class ReadingIntermediateProvider {
    fun loadReadingIntermediate(): List<ReadingItem> {
        return listOf(
            ReadingItem(
                id = 1,
                title = "Reading Intermediate 1",
                reading = "Content of reading 1",
                questions = listOf(
                    QuestionItem(
                        question = "pregunta Intermediate 1",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Intermediate 2",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Intermediate 3",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Intermediate 4",
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
                id = 2,
                title = "Reading Intermediate 2",
                reading = "Content of reading 2",
                questions = listOf(
                    QuestionItem(
                        question = "pregunta Intermediate 1",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Intermediate 2",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Intermediate 3",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Intermediate 4",
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
                title = "Reading Intermediate 3",
                reading = "Content of reading 3",
                questions = listOf(
                    QuestionItem(
                        question = "pregunta Intermediate 1",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Intermediate 2",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Intermediate 3",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Intermediate 4",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    )
                ),
                image = R.drawable.libro_de_lectura
            )
        )
    }
}