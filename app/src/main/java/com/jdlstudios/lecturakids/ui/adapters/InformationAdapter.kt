package com.jdlstudios.lecturakids.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jdlstudios.lecturakids.data.entities.ReadingEntity
import com.jdlstudios.lecturakids.databinding.ItemReadingInformationBinding
import com.jdlstudios.lecturakids.domain.utils.Utils

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
            binding.textPercentage.text = String.format("%d %%", item.percentage)
            binding.progressBar.progress = item.percentage
            binding.textLevel.text = Utils.getDifficult(item.level)
            binding.textDate.text = item.date
            binding.textTime.text = item.time
            binding.textAnswerCorrects.text = String.format("%d correctas", item.answerCorrects)
            binding.textScore.text = String.format("%d pts", item.score)
            binding.imageReadingItemInformation.setImageResource(item.image)
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