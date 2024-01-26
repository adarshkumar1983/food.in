package com.example.foodin

// ListFragment.kt
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListFragment : Fragment() {

    private val availableItems = listOf(
        AvailableItem(1, "French Fries", 3.99, 10),
        AvailableItem(2, "Coke", 1.99, 20),
        // Add more available items as needed
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerViewAvailableItems)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = AvailableItemAdapter(availableItems)

        return view
    }
}
