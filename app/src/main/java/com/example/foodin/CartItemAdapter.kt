package com.example.foodin

// CartItemAdapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CartItemAdapter(private val dataSet: List<CartItem>) :
    RecyclerView.Adapter<CartItemAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemName: TextView = view.findViewById(R.id.itemName)
        val itemPrice: TextView = view.findViewById(R.id.itemPrice)
        val itemQuantity: TextView = view.findViewById(R.id.itemQuantity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cart_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataSet[position]
        holder.itemName.text = item.name
        holder.itemPrice.text = "$${item.price}"
        holder.itemQuantity.text = "Quantity: ${item.quantity}"
    }

    override fun getItemCount(): Int = dataSet.size
}
