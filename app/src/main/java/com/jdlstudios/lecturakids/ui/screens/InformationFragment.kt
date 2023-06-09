package com.jdlstudios.lecturakids.ui.screens

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.jdlstudios.lecturakids.LecturaApplication
import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.databinding.FragmentInformationBinding
import com.jdlstudios.lecturakids.domain.utils.Utils
import com.jdlstudios.lecturakids.ui.adapters.InformationAdapter
import com.jdlstudios.lecturakids.ui.viewmodels.InformationViewModel
import com.jdlstudios.lecturakids.ui.viewmodels.InformationViewModelFactory
import java.util.Locale

class InformationFragment : Fragment() {

    private lateinit var binding: FragmentInformationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInformationBinding.inflate(inflater)

        MobileAds.initialize(requireContext()) {}
        val adRequest = AdRequest.Builder().build()
        binding.adView7.loadAd(adRequest)

        val recyclerView = binding.recyclerviewInformation
        val adapter = InformationAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        //--------------------------------- Para el VIEWMODEL --------------------------------------------------------------
        val application = requireNotNull(this.activity).application

        val viewModel: InformationViewModel by viewModels {
            InformationViewModelFactory((application as LecturaApplication).repository)
        }
        //-------------------------------------------------------------------------------------------------------------------


        viewModel.allReadings.observe(viewLifecycleOwner) { lista ->
            lista.let {
                adapter.submitList(it)
            }
            val percentageAverage = Utils.getPercentageAverage(lista)
            val size = lista.size
            binding.textReadingsNumber.text =
                String.format("Total de lecturas realizadas: %d", size)
            binding.textPercentageCorrects.text =
                String.format("Promedio de respuestas correctas: %d %%", percentageAverage)
            if (lista.isEmpty()) {
                binding.textLastTitle.text = String.format(
                    "Lectura más reciente: %s",
                    "-"
                )
            } else {
                binding.textLastTitle.text = String.format("Lectura más reciente: %s",
                    lista[0].title.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
            }

        }

        binding.floatingButtonAdd.setOnClickListener {
            val action = R.id.action_informationFragment_to_inicioFragment
            it.findNavController().navigate(action)
        }

        binding.swipeRefreshLayout.setOnRefreshListener {

            Handler(Looper.getMainLooper()).postDelayed({
                binding.swipeRefreshLayout.isRefreshing = false
                viewModel.allReadings.observe(viewLifecycleOwner) {
                    it.let {
                        adapter.submitList(it)
                    }
                }
            }, 1000)
        }

        return binding.root
    }

}