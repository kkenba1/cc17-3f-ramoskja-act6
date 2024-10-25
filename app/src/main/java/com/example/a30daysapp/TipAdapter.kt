package com.example.a30daysapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Tip(val day: Int, val text: String, val image: Int)

class TipAdapter(private val tips: List<Tip>) : RecyclerView.Adapter<TipAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dayTextView: TextView = itemView.findViewById(R.id.dayTextView)
        val textTextView: TextView = itemView.findViewById(R.id.textTextView)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemtip, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tip = tips[position]
        holder.dayTextView.text = "Day ${tip.day}"
        holder.textTextView.text = tip.text
        holder.imageView.setImageResource(tip.image)
    }

    override fun getItemCount() = tips.size
}

