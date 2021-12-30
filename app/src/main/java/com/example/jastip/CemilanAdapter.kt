package com.example.jastip

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.jastip.CemilanAdapter.*
import com.example.jastip.model.ModelCemilan

class CemilanAdapter (private val listData: ArrayList<ModelCemilan>) : RecyclerView.Adapter<ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.card_cemilan, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = listData[position]
        Glide.with(holder.itemView.context)
            .load(data.cemilanPhoto)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhotoCemilan)
        holder.tvNameCemilan.text = data.cemilanName
        holder.tvSubCemilan.text = data.cemilanSub
        holder.tvHargaCemilan.text = data.cemilanHarga
    }

    override fun getItemCount(): Int {
        return listData.size;
    }

    class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvNameCemilan: TextView = itemView.findViewById(R.id.tv_title_card)
        var tvSubCemilan: TextView = itemView.findViewById(R.id.tv_subtitle_card)
        var tvHargaCemilan: TextView = itemView.findViewById(R.id.tv_harga_card)
        var imgPhotoCemilan: ImageView = itemView.findViewById(R.id.gambar_card)
    }
}