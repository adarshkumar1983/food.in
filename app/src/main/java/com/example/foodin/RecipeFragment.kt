package com.example.foodin

// RecipeFragment.kt
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class RecipeFragment : Fragment() {

    // Example recipe details (replace with your data model)
    private val recipeName = "Delicious Burger"
    private val recipeIngredients = "Ingredients:\n1. Burger Patty\n2. Cheese\n3. Lettuce\n4. Tomato\n5. Sauce"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recipe, container, false)

        val txtRecipeName: TextView = view.findViewById(R.id.recipeName)
        val txtIngredients: TextView = view.findViewById(R.id.recipeIngredients)
        val btnAddToCart: Button = view.findViewById(R.id.btnAddToCart)

        txtRecipeName.text = recipeName
        txtIngredients.text = recipeIngredients

        btnAddToCart.setOnClickListener {
            // Implement logic to add the current recipe to the cart
            // You may want to use a ViewModel to handle data and communication between fragments
            // For simplicity, you can store data in a shared ViewModel or a repository
        }

        return view
    }
}
