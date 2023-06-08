package com.jdlstudios.lecturakids.ui.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.databinding.FragmentInicioBinding

class InicioFragment : Fragment() {

    private lateinit var binding: FragmentInicioBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInicioBinding.inflate(inflater)


        MobileAds.initialize(requireContext()) {}
        val adRequest = AdRequest.Builder().build()
        binding.adView.loadAd(adRequest)


        binding.btnStart.setOnClickListener {
            it.findNavController().navigate(R.id.action_inicioFragment_to_selectedLevelFragment)
        }

        binding.btnStInformation.setOnClickListener {
            it.findNavController().navigate(R.id.action_inicioFragment_to_informationFragment)
        }

        return binding.root
    }
}