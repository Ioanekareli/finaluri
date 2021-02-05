package com.example.myapplicationfinaluri.fragments

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplicationfinaluri.R

class HomeFragment: Fragment(R.layout.fragment_home_page) {
    private lateinit var spinner: Spinner
    private lateinit var textView: TextView
    private lateinit var imageView: ImageView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        spinner = view.findViewById(R.id.spinner2)
        textView = view.findViewById(R.id.textView)
        imageView = view.findViewById(R.id.imageView2)




    }
}