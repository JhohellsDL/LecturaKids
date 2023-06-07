package com.jdlstudios.lecturakids.ui.screens

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingAdvancedProvider
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingBeginnerProvider
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingIntermediateProvider
import com.jdlstudios.lecturakids.databinding.FragmentQuestionsBinding
import com.jdlstudios.lecturakids.domain.models.EndingItem
import com.jdlstudios.lecturakids.domain.models.QuestionItem
import com.jdlstudios.lecturakids.domain.models.ReadingItem
import com.jdlstudios.lecturakids.domain.usescases.GetReadingUseCase
import com.jdlstudios.lecturakids.domain.utils.StopWatch
import com.jdlstudios.lecturakids.domain.utils.Utils

class QuestionsFragment : Fragment() {

    private lateinit var binding: FragmentQuestionsBinding

    private val getReadingUseCase: GetReadingUseCase = GetReadingUseCase(
        readingBeginnerRepository = ReadingBeginnerProvider(),
        readingIntermediateRepository = ReadingIntermediateProvider(),
        readingAdvancedRepository = ReadingAdvancedProvider()
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuestionsBinding.inflate(inflater)

        val safeArgs: QuestionsFragmentArgs by navArgs()
        val level = safeArgs.level
        val id = safeArgs.id

        var answersCorrect = 0
        var time = 0

        // Uso del cronómetro
        val stopWatch = StopWatch { tiempoTranscurrido ->
            val secondsElapsed = tiempoTranscurrido / 1000
            time = secondsElapsed.toInt()
            Log.i("lectura", "Segundos transcurridos: $secondsElapsed")
        }
        stopWatch.start()

        val reading: ReadingItem = getReadingUseCase.invoke(level, (id - 1))
        val listQuestions: List<QuestionItem> = reading.questions
        var position = 0

        var currentQuestion: String = listQuestions[0].question
        var listAnswersCorrect = listQuestions[0].options[0]
        var answerUser = ""
        var listOptionsQuestion: List<String> = listQuestions[0].options.shuffled()

        binding.firstAnswerRadioButton.text = listOptionsQuestion[0]
        binding.secondAnswerRadioButton.text = listOptionsQuestion[1]
        binding.thirdAnswerRadioButton.text = listOptionsQuestion[2]
        binding.fourthAnswerRadioButton.text = listOptionsQuestion[3]
        binding.readingTitleQuestions.text = reading.title
        binding.questionImageReading.setImageResource(reading.image)

        Log.i("lectura", "currentQuestion: $currentQuestion")

        binding.questionText.text = currentQuestion
        binding.btnEnviar.isEnabled = false


        binding.questionRadioGroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.firstAnswerRadioButton -> {
                    answerUser = binding.firstAnswerRadioButton.text as String
                    binding.btnEnviar.isEnabled = true
                }

                R.id.secondAnswerRadioButton -> {
                    answerUser = binding.secondAnswerRadioButton.text as String
                    binding.btnEnviar.isEnabled = true
                }

                R.id.thirdAnswerRadioButton -> {
                    answerUser = binding.thirdAnswerRadioButton.text as String
                    binding.btnEnviar.isEnabled = true
                }

                R.id.fourthAnswerRadioButton -> {
                    answerUser = binding.fourthAnswerRadioButton.text as String
                    binding.btnEnviar.isEnabled = true
                }
            }
        }

        binding.btnEnviar.setOnClickListener {
            if (listAnswersCorrect == answerUser) {
                Log.i("lectura", "answer: $listAnswersCorrect -> $answerUser")
                answersCorrect++
            } else {
                Log.i("lectura", "answer: $listAnswersCorrect -> $answerUser")
            }

            binding.questionRadioGroup.clearCheck()
            position += 1

            if (position < listQuestions.size) {

                currentQuestion = listQuestions[position].question
                binding.questionText.text = currentQuestion
                listAnswersCorrect = listQuestions[position].options[0]
                listOptionsQuestion = listQuestions[position].options.shuffled()
                binding.firstAnswerRadioButton.text = listOptionsQuestion[0]
                binding.secondAnswerRadioButton.text = listOptionsQuestion[1]
                binding.thirdAnswerRadioButton.text = listOptionsQuestion[2]
                binding.fourthAnswerRadioButton.text = listOptionsQuestion[3]
                binding.btnEnviar.isEnabled = false

            } else {
                stopWatch.stop()
                val endingItem = EndingItem(
                    title = reading.title,
                    level = level,
                    percentage = Utils.getPercentage(answersCorrect),
                    answersCorrect = answersCorrect,
                    time = time,
                    score = Utils.getScore(time, answersCorrect)
                )
                val action =
                    QuestionsFragmentDirections.actionQuestionsFragmentToEndReadingFragment(
                        endingItem
                    )
                it.findNavController().navigate(action)
            }

        }

        return binding.root
    }

}