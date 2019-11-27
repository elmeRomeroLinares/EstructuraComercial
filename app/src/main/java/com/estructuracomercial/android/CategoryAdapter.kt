package com.estructuracomercial.android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(
    val data: List<String>,
    val listener: OnCategoryListener
) : RecyclerView.Adapter<CategoryAdapter.Holder>() {

    inner class Holder(itemview: View): RecyclerView.ViewHolder(itemview) {
        fun setData(name: String){
            val textView = itemView.findViewById<TextView>(R.id.category_name)
            textView.text = name

            itemView.rootView.setOnClickListener {
                listener.onClickCategory(name)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return  Holder(view)
    }

    override fun getItemCount() =  data.size


    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.setData(data[position])
    }

    interface OnCategoryListener {
        fun onClickCategory(name: String)
    }

}