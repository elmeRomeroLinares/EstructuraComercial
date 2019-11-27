package com.estructuracomercial.android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.net.toUri
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.estructuracomercial.android.databinding.ItemDetailBinding

class DetailAdapter(
    val data: List<Local>
) : RecyclerView.Adapter<DetailAdapter.Holder>() {
    class Holder(itemview: View): RecyclerView.ViewHolder(itemview) {
        fun setData(local: Local){
            val binding : ItemDetailBinding? = DataBindingUtil.bind(itemView)
            binding?.local = local

            val progressDrawable = CircularProgressDrawable(itemView.context)
            progressDrawable.strokeWidth = 5f
            progressDrawable.centerRadius = 30f
            progressDrawable.start()

            binding?.imageView4?.let {
                GlideApp.with(it.context)
                    .load(local.image?.toUri())
                    .placeholder(progressDrawable)
                    .into(it)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_detail, parent, false)
        return  Holder(view)
    }

    override fun getItemCount() =  data.size


    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.setData(data[position])
    }

}