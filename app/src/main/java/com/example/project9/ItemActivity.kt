package com.example.project9

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_item)

        val linkToClass: TextView = findViewById(R.id.link_to_class)
        val title: TextView = findViewById(R.id.item_title_one)
        val vk: TextView = findViewById(R.id.text_view_vk)

        title.text = intent.getStringExtra("itemTitle")
        vk.text = intent.getStringExtra("itemVk")


        linkToClass.setOnClickListener {
            val intent = Intent(this, ItemsActivity::class.java)
            startActivity(intent)
        }
    }
}