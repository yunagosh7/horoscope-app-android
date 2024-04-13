package com.example.volviendo_a_android.ui.horoscope.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.volviendo_a_android.R
import com.example.volviendo_a_android.domain.model.HoroscopeInfo

class HoroscopeAdapter(
    private var horoscopeList: List<HoroscopeInfo> = emptyList(),
    private val onItemSelected: (item: HoroscopeInfo) -> Unit
    ) : RecyclerView.Adapter<HoroscopeViewHolder>() {

    fun updateList(itemList: List<HoroscopeInfo>) {
        horoscopeList = itemList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
        return HoroscopeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_horoscope , parent, false)
        )
    }

    override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
        holder.render(horoscopeList[position], onItemSelected)
    }

    override fun getItemCount(): Int = horoscopeList.size;
}