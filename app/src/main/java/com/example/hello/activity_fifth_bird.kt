package com.example.hello

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.hello.databinding.ActivityFifthBirdBinding
import com.example.hello.databinding.ActivityForthBirdBinding
import com.squareup.picasso.Picasso

class activity_fifth_bird : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnPrev2.setOnClickListener {
            finish()
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1486365227551-f3f90034a57c?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTl8fGJpcmRzfGVufDB8fDB8fHww")
            .centerCrop()
            .resize(1000,2000)
            .into(binding.imageView9)

    }
}