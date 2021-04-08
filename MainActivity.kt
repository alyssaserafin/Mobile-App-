package com.example.buttonapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.buttonapp2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.button.text = "Congrats, you just clicked the button"
        }





    }
}