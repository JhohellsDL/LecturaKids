package com.jdlstudios.lecturakids.ui.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingAdvancedProvider
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingBeginnerProvider
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingIntermediateProvider
import com.jdlstudios.lecturakids.databinding.FragmentSelectedReadingBinding
import com.jdlstudios.lecturakids.domain.usescases.GetListReadingAdvancedUseCase
import com.jdlstudios.lecturakids.domain.usescases.GetListReadingBeginnerUseCase
import com.jdlstudios.lecturakids.domain.usescases.GetListReadingIntermediateUseCase
import com.jdlstudios.lecturakids.ui.adapters.SelectedReadingAdapter

class SelectedReadingFragment : Fragment() {

    private lateinit var binding: FragmentSelectedReadingBinding

    private var readingBeginnerProvider = ReadingBeginnerProvider()
    private var getListReadingBeginnerUseCase =
        GetListReadingBeginnerUseCase(readingBeginnerProvider)

    private var readingIntermediateProvider = ReadingIntermediateProvider()
    private var getListReadingIntermediateUseCase =
        GetListReadingIntermediateUseCase(readingIntermediateProvider)

    private var readingAdvancedProvider = ReadingAdvancedProvider()
    private var getListReadingAdvancedUseCase =
        GetListReadingAdvancedUseCase(readingAdvancedProvider)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectedReadingBinding.inflate(inflater)

        val safeArgs: SelectedReadingFragmentArgs by navArgs()
        val level = safeArgs.level

        Snackbar.make(binding.root, "Level : $level", Snackbar.LENGTH_SHORT).show()

        val adapter = SelectedReadingAdapter(
            onClickListener ={
                Toast.makeText(requireContext(), "Item: ${it.title}", Toast.LENGTH_SHORT).show()
            }
        )

        when(level){
            1 -> adapter.data = getListReadingBeginnerUseCase.invoke()
            2 -> adapter.data = getListReadingIntermediateUseCase.invoke()
            3 -> adapter.data = getListReadingAdvancedUseCase.invoke()
        }

        binding.recyclerViewReading.adapter = adapter

        val manager = GridLayoutManager(activity, 3, GridLayoutManager.VERTICAL, false)
        binding.recyclerViewReading.layoutManager = manager

        return binding.root
    }
}