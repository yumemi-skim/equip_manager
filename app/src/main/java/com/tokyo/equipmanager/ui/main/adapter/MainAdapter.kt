package com.tokyo.equipmanager.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tokyo.equipmanager.databinding.EquipmentItemBinding
import com.tokyo.equipmanager.ui.main.item.EquipData

class MainAdapter() : RecyclerView.Adapter<MainAdapter.BindingHolder>() {

    val equipList: MutableList<EquipData> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingHolder {
        return EquipmentItemBinding.inflate(LayoutInflater.from(parent.context), parent, false).let {
            BindingHolder(it)
        }
    }

    override fun onBindViewHolder(holder: BindingHolder, position: Int) {
        val item = equipList[position]
        holder.binding.let {
            it.title.text = item.title
            it.message.text = item.message
        }
    }

    override fun getItemCount(): Int = equipList.size

    class BindingHolder(val binding: EquipmentItemBinding) : RecyclerView.ViewHolder(binding.root)
}