package com.jdlstudios.lecturakids.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingBeginnerProvider
import com.jdlstudios.lecturakids.domain.models.ReadingItem
import com.jdlstudios.lecturakids.domain.usescases.GetListReadingBeginnerUseCase

class SelectedReadingAdapter : RecyclerView.Adapter<SelectedReadingAdapter.ViewHolder>() {

    private var readingBeginnerProvider: ReadingBeginnerProvider = ReadingBeginnerProvider()
    private var getListReadingBeginnerUseCase: GetListReadingBeginnerUseCase =
        GetListReadingBeginnerUseCase(readingBeginnerProvider)

    var data = getListReadingBeginnerUseCase.invoke()

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val textTitle: TextView = itemView.findViewById(R.id.text_title)

        private fun ViewHolder.bind(item: ReadingItem) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_reading, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        bind(holder, item)
    }

    fun bind(
        holder: ViewHolder,
        item: ReadingItem
    ) {
        holder.textTitle.text = item.title
    }

}