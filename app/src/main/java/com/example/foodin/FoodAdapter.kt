package com.example.foodin

// FoodAdapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide

class FoodAdapter(private val dataSet: List<FoodItem>) :
    RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemName: TextView = view.findViewById(R.id.itemName)
        val itemPrice: TextView = view.findViewById(R.id.itemPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_food, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataSet[position]
        holder.itemName.text = item.name
        holder.itemPrice.text = "$${item.price}"

        // Load image using Glide or any other image loading library
        // Glide.with(holder.itemView.context).load(item.imageUrl).into(holder.itemImage)
    }

    override fun getItemCount(): Int = dataSet.size
}
