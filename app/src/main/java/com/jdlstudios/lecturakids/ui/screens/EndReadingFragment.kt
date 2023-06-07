package com.jdlstudios.lecturakids.ui.screens

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.jdlstudios.lecturakids.LecturaApplication
import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.data.entities.ReadingEntity
import com.jdlstudios.lecturakids.databinding.FragmentEndReadingBinding
import com.jdlstudios.lecturakids.domain.utils.Utils
import com.jdlstudios.lecturakids.ui.viewmodels.InformationViewModel
import com.jdlstudios.lecturakids.ui.viewmodels.InformationViewModelFactory

@RequiresApi(Build.VERSION_CODES.O)
class EndReadingFragment : Fragment() {

    private lateinit var binding: FragmentEndReadingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEndReadingBinding.inflate(inflater)

        val safeArgs: EndReadingFragmentArgs by navArgs()

        val score: Int = safeArgs.endingItem.score
        val title: String = safeArgs.endingItem.title
        val time: Int = safeArgs.endingItem.time
        val level: Int = safeArgs.endingItem.level
        val percentage: Int = safeArgs.endingItem.percentage
        val answersCorrect: Int = safeArgs.endingItem.answersCorrect


        when (score) {
            in 81..99 -> {
                binding.txtMessageCongratulations.setText(R.string.message_congratulations)
                binding.txtMessage.setText(R.string.message_completion_correct)
            }

            in 61..80 -> {
                binding.txtMessageCongratulations.setText(R.string.message_felicitations)
                binding.txtMessage.setText(R.string.message_completion)
            }

            else -> {
                binding.txtMessageCongratulations.setText(R.string.message_attention)
                binding.txtMessage.setText(R.string.message_retry)
            }
        }

        binding.textScore.text = String.format("%d pts", score)
        binding.txtTitleReading.text = title
        binding.textTime.text = Utils.convertSecondsTime(time)
        binding.textAnswerCorrects.text = answersCorrect.toString()

        //--------------------------------- Para el VIEWMODEL --------------------------------------------------------------
        val application = requireNotNull(this.activity).application

        val viewModel: InformationViewModel by viewModels {
            InformationViewModelFactory((application as LecturaApplication).repository)
        }
        //-------------------------------------------------------------------------------------------------------------------

        val readingEntity: ReadingEntity = Utils.toReadingEntity(
            title = title,
            date = Utils.getDateCurrentTime(),
            time = Utils.convertSecondsTime(time),
            level = level,
            percentage = percentage,
            answersCorrect = answersCorrect,
            score = score
        )

        binding.btnTerminar.setOnClickListener {
            viewModel.insert(readingEntity)
            it.findNavController().navigate(R.id.action_endReadingFragment_to_informationFragment)
        }

        return binding.root
    }

}