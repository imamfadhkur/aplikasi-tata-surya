package com.example.tata_surya

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class planetAdapter(
    val listData: ArrayList<dataClassPlanet>,
    val onItemClickCallBack: adapterInterface
): RecyclerView.Adapter<planetAdapter.viewHolder>() {

    class viewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvname: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvdetil: TextView = itemView.findViewById(R.id.tv_item_detail)
        val tvfoto: ImageView = itemView.findViewById(R.id.item_img_foto)
    }

    interface adapterInterface{
        fun onItemClicked(list: dataClassPlanet)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val layout: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_planet, parent, false)
        return viewHolder(layout)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val list = listData[position]

        holder.tvname.text = list.name
        holder.tvdetil.text = list.detail
        holder.tvfoto.setImageResource(list.foto)
        holder.itemView.setOnClickListener { onItemClickCallBack.onItemClicked(list) }
    }

    override fun getItemCount(): Int {
        return listData.size
    }


}