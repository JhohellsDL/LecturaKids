package com.jdlstudios.lecturakids.ui.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.android.material.snackbar.Snackbar
import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingBeginnerProvider
import com.jdlstudios.lecturakids.databinding.FragmentSelectedLevelBinding
import com.jdlstudios.lecturakids.domain.models.ReadingItem
import com.jdlstudios.lecturakids.domain.usescases.GetRandomReadingBeginnerUseCase

class SelectedLevelFragment : Fragment() {

    private lateinit var binding: FragmentSelectedLevelBinding
    private val readingBeginnerRepository: ReadingBeginnerProvider = ReadingBeginnerProvider()
    private val getRandomReadingBeginnerUseCase: GetRandomReadingBeginnerUseCase =
        GetRandomReadingBeginnerUseCase(readingBeginnerRepository)

    private var level: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectedLevelBinding.inflate(inflater)

        binding.radioGroupLevels.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radioButtonLevelBeginner -> {
                    level = 1
                }

                R.id.radioButtonLevelIntermediate -> {
                    level = 2
                }

                R.id.radioButtonLevelAdvanced -> {
                    level = 3
                }
            }
        }

        binding.btnStartRandom.setOnClickListener {
            if (level == 0) {
                Snackbar.make(binding.root, "Por favor, selecciona un nivel", Snackbar.LENGTH_SHORT)
                    .show()
            } else {
                val reading: ReadingItem = getRandomReadingBeginnerUseCase.invoke()
                val id = reading.id
                val action =
                    SelectedLevelFragmentDirections.actionSelectedLevelFragmentToReadingFragment(
                        level,
                        id
                    )
                it.findNavController().navigate(action)
            }
        }

        binding.btnStartSelected.setOnClickListener {
            if (level == 0) {
                Snackbar.make(binding.root, "Por favor, selecciona un nivel", Snackbar.LENGTH_SHORT)
                    .show()
            } else {
                val action =
                    SelectedLevelFragmentDirections.actionSelectedLevelFragmentToSelectedReadingFragment(
                        level
                    )
                it.findNavController().navigate(action)
            }
        }

        return binding.root
    }

}