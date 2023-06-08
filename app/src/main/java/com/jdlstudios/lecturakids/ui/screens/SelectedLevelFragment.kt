package com.jdlstudios.lecturakids.ui.screens

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.material.snackbar.Snackbar
import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingAdvancedProvider
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingBeginnerProvider
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingIntermediateProvider
import com.jdlstudios.lecturakids.databinding.FragmentSelectedLevelBinding

class SelectedLevelFragment : Fragment() {

    private lateinit var binding: FragmentSelectedLevelBinding

    private var level: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectedLevelBinding.inflate(inflater)

        MobileAds.initialize(requireContext()) {}
        val adRequest = AdRequest.Builder().build()
        binding.adView2.loadAd(adRequest)

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
            var size = 0
            if (level == 0) {
                Snackbar.make(binding.root, "Por favor, selecciona un nivel", Snackbar.LENGTH_SHORT)
                    .show()
            } else {
                when (level) {
                    1 -> size = ReadingBeginnerProvider().loadReadingBeginner().size
                    2 -> size = ReadingIntermediateProvider().loadReadingIntermediate().size
                    3 -> size = ReadingAdvancedProvider().loadReadingAdvanced().size
                }
                Log.i("asd", "size $size")
                val id = (0..size).random()
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