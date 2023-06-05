package com.jdlstudios.lecturakids.ui.screens

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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

        var answersCorrect: Int = 0
        val score: Int = 0
        var time: Int = 0


        // Uso del cronómetro
        val stopWatch = StopWatch { tiempoTranscurrido ->
            val secondsElapsed = tiempoTranscurrido / 1000
            time = secondsElapsed.toInt()
            Log.i("lectura","Segundos transcurridos: $secondsElapsed")
        }
        stopWatch.start()
        /*val stopwatch = Cronometro()

        stopwatch.start()

        Log.i("lectura","Tiempo inicio: ${stopwatch.getElapsedTime()} ms")*/

// Realiza algunas operaciones o espera un tiempo...


        val reading: ReadingItem = getReadingUseCase.invoke(level, (id-1))
        val listQuestions: List<QuestionItem> = reading.questions
        var position = 0
        Log.i("lectura", "questions: ${listQuestions.size}")

        var currentQuestion: String = listQuestions[0].question
        var listAnswersCorrect = listQuestions[0].options[0]
        var answerUser = ""
        var listOptionsQuestion: List<String> = listQuestions[0].options.shuffled()
        binding.firstAnswerRadioButton.text = listOptionsQuestion[0]
        binding.secondAnswerRadioButton.text = listOptionsQuestion[1]
        binding.thirdAnswerRadioButton.text = listOptionsQuestion[2]
        binding.fourthAnswerRadioButton.text = listOptionsQuestion[3]
        binding.readingTitleQuestions.text = reading.title

        Log.i("lectura", "currentQuestion: $currentQuestion")

        binding.questionText.text = currentQuestion.toString()


        binding.questionRadioGroup.setOnCheckedChangeListener { group, checkedId ->
            // Verificar cuál RadioButton ha sido seleccionado
            when (checkedId) {
                R.id.firstAnswerRadioButton -> {
                    // Opción seleccionada: Nivel principiante
                    // Puedes realizar las acciones correspondientes aquí
                    Log.i("lectura", "Beginner")
                    answerUser = binding.firstAnswerRadioButton.text as String
                    Toast.makeText(requireContext(), "Title: $answerUser", Toast.LENGTH_SHORT).show()
                }
                R.id.secondAnswerRadioButton -> {
                    // Opción seleccionada: Nivel intermedio
                    // Puedes realizar las acciones correspondientes aquí
                    answerUser = binding.secondAnswerRadioButton.text as String
                    Toast.makeText(requireContext(), "Title: $answerUser", Toast.LENGTH_SHORT).show()
                }
                R.id.thirdAnswerRadioButton -> {
                    // Opción seleccionada: Nivel avanzado
                    // Puedes realizar las acciones correspondientes aquí
                    answerUser = binding.thirdAnswerRadioButton.text as String
                    Toast.makeText(requireContext(), "Title: $answerUser", Toast.LENGTH_SHORT).show()
                }
                R.id.fourthAnswerRadioButton -> {
                    // Opción seleccionada: Nivel avanzado
                    // Puedes realizar las acciones correspondientes aquí
                    answerUser = binding.fourthAnswerRadioButton.text as String
                    Toast.makeText(requireContext(), "Title: $answerUser", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.btnEnviar.setOnClickListener {
            if (listAnswersCorrect == answerUser){
                Log.i("lectura", "answer: $listAnswersCorrect -> $answerUser")
                answersCorrect ++
                Toast.makeText(requireContext(), "Correct", Toast.LENGTH_SHORT).show()
            }else{
                Log.i("lectura", "answer: $listAnswersCorrect -> $answerUser")
                Toast.makeText(requireContext(), "Incorrect", Toast.LENGTH_SHORT).show()
            }
            position += 1

            if (position < listQuestions.size){

                currentQuestion = listQuestions[position].question
                binding.questionText.text = currentQuestion.toString()
                listAnswersCorrect = listQuestions[position].options[0]
                listOptionsQuestion = listQuestions[position].options.shuffled()
                binding.firstAnswerRadioButton.text = listOptionsQuestion[0]
                binding.secondAnswerRadioButton.text = listOptionsQuestion[1]
                binding.thirdAnswerRadioButton.text = listOptionsQuestion[2]
                binding.fourthAnswerRadioButton.text = listOptionsQuestion[3]

            }else{
                stopWatch.stop()
                val endingItem = EndingItem(answersCorrect = answersCorrect, time = time, score = score)
                val action = QuestionsFragmentDirections.actionQuestionsFragmentToEndReadingFragment(endingItem)
                it.findNavController().navigate(action)
            }

        }


        // casi esta bien al elegir la tectura,pero al poner en random da error coregir eso

        /*binding.firstAnswerRadioButton.text = listOptionsQuestion[0]
        binding.secondAnswerRadioButton.text = listOptionsQuestion[1]
        binding.thirdAnswerRadioButton.text = listOptionsQuestion[2]
        binding.fourthAnswerRadioButton.text = listOptionsQuestion[3]*/

        return binding.root
    }

}