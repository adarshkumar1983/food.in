package com.example.foodin

// CartFragment.kt
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CartFragment : Fragment() {

    private val cartItems = mutableListOf<CartItem>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cart, container, false)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerViewCartItems)
        val btnShopAndTrack: Button = view.findViewById(R.id.btnShopAndTrack)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val cartItemAdapter = CartItemAdapter(cartItems)
        recyclerView.adapter = cartItemAdapter

        // Add sample data to the cart
        cartItems.add(CartItem(1, "French Fries", 3.99, 2))
        cartItems.add(CartItem(2, "Coke", 1.99, 1))
        cartItemAdapter.notifyDataSetChanged()

        btnShopAndTrack.setOnClickListener {
            // Implement logic to shop and track delivery
            // You may navigate to a new fragment or activity to complete the shopping process
        }

        return view
    }
}
