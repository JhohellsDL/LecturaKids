package com.jdlstudios.lecturakids.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingBeginnerProvider
import com.jdlstudios.lecturakids.databinding.ItemReadingBinding
import com.jdlstudios.lecturakids.domain.models.ReadingItem
import com.jdlstudios.lecturakids.domain.usescases.GetListReadingBeginnerUseCase

class SelectedReadingAdapter : RecyclerView.Adapter<SelectedReadingAdapter.ViewHolder>() {

    private var readingBeginnerProvider: ReadingBeginnerProvider = ReadingBeginnerProvider()
    private var getListReadingBeginnerUseCase: GetListReadingBeginnerUseCase =
        GetListReadingBeginnerUseCase(readingBeginnerProvider)

    var data = getListReadingBeginnerUseCase.invoke()

    class ViewHolder private constructor(binding: ItemReadingBinding) : RecyclerView.ViewHolder(binding.root) {

        private val textTitle: TextView = binding.textTitle

        fun bind(item: ReadingItem) {
            textTitle.text = item.title
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemReadingBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }
}