package com.jdlstudios.lecturakids.ui.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.databinding.FragmentEndReadingBinding

class EndReadingFragment : Fragment() {

    private lateinit var binding: FragmentEndReadingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEndReadingBinding.inflate(inflater)

        binding.btnTerminar.setOnClickListener {
            it.findNavController().navigate(R.id.action_endReadingFragment_to_informationFragment)
        }

        return binding.root
    }

}