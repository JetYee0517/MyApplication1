package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tree_main.*

class ActivityTreeMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tree_main)

        buttonPlant.setOnClickListener {
            val intent = Intent(this, Tree::class.java)
            startActivity(intent)
        }

        buttonMyTrees.setOnClickListener {
            val intent = Intent(this, MyTrees::class.java)
            startActivity(intent)
        }


    }

    override fun onBackPressed() {
        super.onBackPressed()
        
    }
}