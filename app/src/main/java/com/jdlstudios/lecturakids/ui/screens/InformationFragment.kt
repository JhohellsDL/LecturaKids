package com.jdlstudios.lecturakids.ui.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.databinding.FragmentInformationBinding

class InformationFragment : Fragment() {

    private lateinit var binding: FragmentInformationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInformationBinding.inflate(inflater)

        binding.btnVolver.setOnClickListener {
            it.findNavController().navigate(R.id.action_informationFragment_to_inicioFragment)
        }

        return binding.root
    }

}