package com.dacha.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dacha.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initclicker()
    }

    private fun initclicker() {
        with(binding){
            btnPlus.setOnClickListener{
                tvResult.text = Math().add(num1.text.toString() , num2.text.toString())
            }
            btn.setOnClickListener{
                tvResult.text = Math().divide(num1.text.toString() , num2.text.toString())
            }
        }
    }
}