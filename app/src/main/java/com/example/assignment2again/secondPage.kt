package com.example.assignment2again

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class secondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.second)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // declaring variables of the buttons and pet image
        val petImageView = findViewById<ImageView>(R.id.petImageView)
        val feedButton = findViewById<Button>(R.id.feedButton)
        val cleanButton = findViewById<Button>(R.id.cleanButton)
        val playButton = findViewById<Button>(R.id.playButton)

        // declaring the status of the app
       val healthTextView = findViewById<EditText>(R.id.healthTextView)
       val hungerTextView = findViewById<EditText>(R.id.hungerTextView)
       val cleanlinessTextView = findViewById<EditText>(R.id.cleanlinessTextView)

        // declaring the values of the status initially
        var healthValue = 0
        var hungerValue = 0
        var cleanlinessValue =0

// setting click on listener to display both the image of the cat eating and adding points when it does
    feedButton.setOnClickListener { petImageView.setImageResource(R.drawable.cute_calico_cat_eating_pizza_in_pizza_box_funny_wall_and_art_print)
    hungerValue =10
    healthValue += 10
    hungerValue += 5
    hungerTextView.setText(hungerValue.toString()) }

        // setting click on listener to display the image of the cat cleaning in a bathtub and adding points when it does
    cleanButton.setOnClickListener {
        petImageView.setImageResource(R.drawable.a_cute__character_cartoon_cat_lying_in_the_bathtub_with_duck_toy__stock_vector
        )
        cleanlinessValue += 10
        healthValue += 10
        cleanlinessTextView.setText(cleanlinessValue.toString())
    }
// setting click on the listener to display the image of the cat playing with wool and updating it's  status accordingly
   playButton.setOnClickListener { petImageView.setImageResource(R.drawable.cute_calico_cat_playing_with_a_ball_of_yarn_wall_and_art_print)
   healthValue += 10
   hungerValue += 5
   healthTextView.setText(healthValue.toString())}


   }
}