package com.jdlstudios.lecturakids.ui.screens

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.data.AppDatabase
import com.jdlstudios.lecturakids.databinding.FragmentInformationBinding
import com.jdlstudios.lecturakids.ui.viewmodels.InformationViewModel
import com.jdlstudios.lecturakids.ui.viewmodels.InformationViewModelFactory

class InformationFragment : Fragment() {

    private lateinit var binding: FragmentInformationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInformationBinding.inflate(inflater)

        //--------------------------------- Para el VIEWMODEL --------------------------------------------------------------
        val application = requireNotNull(this.activity).application
        val datasource = AppDatabase.getDatabase(application).readingDao()

        val viewModelFactory = InformationViewModelFactory(datasource)

        val viewModel = ViewModelProvider(this, viewModelFactory)[InformationViewModel::class.java]
        //-------------------------------------------------------------------------------------------------------------------



        binding.btnVolver.setOnClickListener {
            //viewModel.getList()
            Log.i("lectura","- ${viewModel.getList()}")
            //it.findNavController().navigate(R.id.action_informationFragment_to_inicioFragment)
        }

        return binding.root
    }

}