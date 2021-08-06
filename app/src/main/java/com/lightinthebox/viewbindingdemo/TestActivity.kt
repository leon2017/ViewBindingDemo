package com.lightinthebox.viewbindingdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        btnSubmit.setOnClickListener {
            Toast.makeText(this, "我被轻轻碰一下了", Toast.LENGTH_SHORT).show()
        }
//        btnTest.setOnClickListener {
//            Toast.makeText(this, "意外了", Toast.LENGTH_SHORT).show()
//        }
//        findViewById<MaterialButton>(R.id.btnTest).setOnClickListener {
//            Toast.makeText(this, "意外了", Toast.LENGTH_SHORT).show()
//        }
    }
}