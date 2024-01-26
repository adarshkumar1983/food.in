package com.example.foodin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            val selectedFragment: Fragment = when (item.itemId) {
                R.id.homeFragment -> HomeFragment()
                R.id.listFragment -> ListFragment()
                R.id.recipeFragment -> RecipeFragment()
                R.id.cartFragment -> CartFragment()
                else -> HomeFragment()
            }

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, selectedFragment).commit()
            true
        }
    }
}
