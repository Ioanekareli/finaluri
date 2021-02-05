package com.example.myapplicationfinaluri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class GeneralPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general_page)

        val menuNav: BottomNavigationView = findViewById(R.id.menuNavigation)
        val navControler = findNavController(R.id.navHostFragment)
        val conf = AppBarConfiguration(
                setOf(
                        R.id.navHome,R.id.navNewPost,R.id.navProfile

                ))
        setupActionBarWithNavController(navControler,conf)
        menuNav.setupWithNavController(navControler)

    }

}