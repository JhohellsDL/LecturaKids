package com.jdlstudios.lecturakids.data.repositories.provider

import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.domain.models.QuestionItem
import com.jdlstudios.lecturakids.domain.models.ReadingItem

class ReadingAdvancedProvider {
    fun loadReadingAdvanced(): List<ReadingItem> {
        return listOf(
            ReadingItem(
                id = 1,
                title = "Reading Advanced 1",
                reading = "Content of reading 1",
                questions = listOf(
                    QuestionItem(
                        question = "pregunta Avanzada 1",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Avanzada 2",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Avanzada 3",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Avanzada 4",
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
                title = "Reading Advanced 2",
                reading = "Content of reading 2",
                questions = listOf(
                    QuestionItem(
                        question = "pregunta Avanzada 1",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Avanzada 2",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Avanzada 3",
                        options = listOf(
                            "question 1.1",
                            "question 1.2",
                            "question 1.3",
                            "question 1.4"
                        ),
                    ),
                    QuestionItem(
                        question = "pregunta Avanzada 4",
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