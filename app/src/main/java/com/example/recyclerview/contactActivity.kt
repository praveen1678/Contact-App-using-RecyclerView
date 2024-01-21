package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class contactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val userName = findViewById<TextView>(R.id.userName)
        val userContactNumber = findViewById<TextView>(R.id.contactNumber)
        val userProfile = findViewById<ImageView>(R.id.userProfile)

        val name = intent.getStringExtra("name")
        val userContact =intent.getStringExtra("contact")
        val Profile = intent.getIntExtra("profile",R.drawable.image1)

        userName.text=name
        userContactNumber.text=userContact
        userProfile.setImageResource(Profile)

    }
}