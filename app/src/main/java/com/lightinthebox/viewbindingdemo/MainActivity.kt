package com.lightinthebox.viewbindingdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.lightinthebox.viewbindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            Toast.makeText(this, "我被轻轻碰一下了", Toast.LENGTH_SHORT).show()
        }

        binding.btnTest.setOnClickListener {
            startActivity(Intent(this, TestActivity::class.java))
        }
    }
}