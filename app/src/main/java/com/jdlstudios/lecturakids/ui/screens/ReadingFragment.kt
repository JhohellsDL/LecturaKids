package com.jdlstudios.lecturakids.ui.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.databinding.FragmentReadingBinding
import com.jdlstudios.lecturakids.databinding.FragmentSelectedLevelBinding

class ReadingFragment : Fragment() {

    private lateinit var binding: FragmentReadingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentReadingBinding.inflate(inflater)

        binding.btnSiguiente.setOnClickListener {
            it.findNavController().navigate(R.id.action_readingFragment_to_endReadingFragment)
        }

        return binding.root
    }

}