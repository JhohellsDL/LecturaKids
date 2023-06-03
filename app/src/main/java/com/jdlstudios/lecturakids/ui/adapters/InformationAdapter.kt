package com.jdlstudios.lecturakids.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jdlstudios.lecturakids.data.entities.ReadingEntity
import com.jdlstudios.lecturakids.databinding.ItemReadingInformationBinding

class InformationAdapter :
    ListAdapter<ReadingEntity, InformationAdapter.ReadingViewHolder>(ReadingComparator()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ReadingViewHolder {
        return ReadingViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: ReadingViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current)
    }

    class ReadingViewHolder private constructor(val binding: ItemReadingInformationBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ReadingEntity) {
            binding.textTitle.text = item.title
            binding.textDate.text = item.date
            binding.textTime.text = item.time.toString()
            binding.textScore.text = item.score.toString()
        }

        companion object {
            fun create(parent: ViewGroup): ReadingViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemReadingInformationBinding.inflate(layoutInflater, parent, false)
                return ReadingViewHolder(binding)
            }
        }
    }

    class ReadingComparator : DiffUtil.ItemCallback<ReadingEntity>() {
        override fun areItemsTheSame(oldItem: ReadingEntity, newItem: ReadingEntity): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: ReadingEntity, newItem: ReadingEntity): Boolean {
            return oldItem.id == newItem.id
        }

    }

}