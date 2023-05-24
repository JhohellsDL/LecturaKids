package com.jdlstudios.lecturakids.ui.screens

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingBeginnerProvider
import com.jdlstudios.lecturakids.databinding.FragmentReadingBinding
import com.jdlstudios.lecturakids.databinding.FragmentSelectedLevelBinding
import com.jdlstudios.lecturakids.domain.models.ReadingItem
import com.jdlstudios.lecturakids.domain.usescases.GetRandomReadingBeginnerUseCase

class SelectedLevelFragment : Fragment() {

    private lateinit var binding: FragmentSelectedLevelBinding
    private val readingBeginnerRepository : ReadingBeginnerProvider = ReadingBeginnerProvider()
    private val getRandomReadingBeginnerUseCase: GetRandomReadingBeginnerUseCase = GetRandomReadingBeginnerUseCase(readingBeginnerRepository)

    private var level: Int = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectedLevelBinding.inflate(inflater)

        binding.radioGroupLevels.setOnCheckedChangeListener { group, checkedId ->
            // Verificar cuál RadioButton ha sido seleccionado
            when (checkedId) {
                R.id.radioButtonLevelBeginner -> {
                    // Opción seleccionada: Nivel principiante
                    // Puedes realizar las acciones correspondientes aquí
                    Log.i("lectura", "Beginner")
                    level = 1
                    val reading: ReadingItem = getRandomReadingBeginnerUseCase.invoke()
                    Toast.makeText(requireContext(), "Title: $reading", Toast.LENGTH_SHORT).show()
                }
                R.id.radioButtonLevelIntermediate -> {
                    // Opción seleccionada: Nivel intermedio
                    // Puedes realizar las acciones correspondientes aquí
                    level = 2
                    Log.i("lectura", "Intermediate")
                }
                R.id.radioButtonLevelAdvanced -> {
                    // Opción seleccionada: Nivel avanzado
                    // Puedes realizar las acciones correspondientes aquí
                    level = 3
                    Log.i("lectura", "Advanced")
                }
            }
        }


        binding.btnStartRandom.setOnClickListener {
            val action = SelectedLevelFragmentDirections.actionSelectedLevelFragmentToSelectedReadingFragment(level)
            it.findNavController().navigate(action)
        }

        binding.btnStartSelected.setOnClickListener {
            val reading: ReadingItem = getRandomReadingBeginnerUseCase.invoke()
            val id = reading.id
            val action = SelectedLevelFragmentDirections.actionSelectedLevelFragmentToReadingFragment(level, id)
            it.findNavController().navigate(action)
        }

        return binding.root
    }

}