package com.jdlstudios.lecturakids.ui.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.databinding.FragmentSelectedLevelBinding

class SelectedLevelFragment : Fragment() {

    private lateinit var binding: FragmentSelectedLevelBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectedLevelBinding.inflate(inflater)

        binding.btnStart.setOnClickListener {
            it.findNavController().navigate(R.id.action_selectedLevelFragment_to_readingFragment)
        }

        return binding.root
    }

}