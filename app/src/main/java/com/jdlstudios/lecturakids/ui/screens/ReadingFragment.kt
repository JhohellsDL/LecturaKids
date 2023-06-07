package com.jdlstudios.lecturakids.ui.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingAdvancedProvider
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingBeginnerProvider
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingIntermediateProvider
import com.jdlstudios.lecturakids.databinding.FragmentReadingBinding
import com.jdlstudios.lecturakids.domain.usescases.GetReadingUseCase

class ReadingFragment : Fragment() {

    private lateinit var binding: FragmentReadingBinding

    private val getReadingUseCase: GetReadingUseCase = GetReadingUseCase(
        readingBeginnerRepository = ReadingBeginnerProvider(),
        readingIntermediateRepository = ReadingIntermediateProvider(),
        readingAdvancedRepository = ReadingAdvancedProvider()
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentReadingBinding.inflate(inflater)

        val safeArgs: ReadingFragmentArgs by navArgs()
        val level = safeArgs.level
        val id = safeArgs.id

        val reading = getReadingUseCase.invoke(level, (id-1))

        binding.textContent.text = reading.reading
        binding.textTitle.text = reading.title
        binding.imageReading.setImageResource(reading.image)

        binding.btnSiguiente.setOnClickListener {
            val action = ReadingFragmentDirections.actionReadingFragmentToQuestionsFragment(level, id)
            it.findNavController().navigate(action)
        }

        return binding.root
    }

}