package com.example.project9

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

var a: Int = 0



class ItemsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val textView = findViewById<TextView>(R.id.text_view_1)
        val items = arrayListOf<item>()
        val linkToStart: TextView = findViewById(R.id.link_to_start)



        items.add(item(1,"Cat", "cat_eyes_face", "5мл", "@string/VK_nine_hb"))
        items.add(item(2,"kot", "_ml", "6мл", "@string/VK_nine_hb"))
        items.add(item(3,"c", "catt", "7мл", "@string/VK_nine_hb"))
        items.add(item(4,"kot", "_hb", "8хб", "@string/VK_nine_hb"))
        items.add(item(5,"c", "_hbb", "9хб", "@string/VK_nine_hb"))

        itemsList.adapter = ItemsAdapter(items, this)
        itemsList.layoutManager = LinearLayoutManager(this)
        textView.movementMethod = LinkMovementMethod.getInstance()


        linkToStart.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            a = +1
        }
    }
}