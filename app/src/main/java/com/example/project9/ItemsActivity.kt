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

        val sc = "Расписание звонков\n1. 9:15 - 9:55\n2. 10:00 - 10:40\n3. 10:55 - 11:35\n4.11:50 - 12:30\n5. 12:45 - 13:25\nОБЕД\n6. 13:55 - 14:35\n7. 14:45 - 15:25\n8. 15:30 - 16:10"
        val scc = "Расписание звонков\n1. 9:15 - 9:55\n2. 10:00 - 10:40\n3. 10:55 - 11:35\n4.11:50 - 12:30\nОБЕД\n5. 13:00 - 13:40\n6. 13:55 - 14:35\n7. 14:45 - 15:25\n8. 15:30 - 16:10"


        items.add(item(0,"c", "post", "Поступающим", "Ознакомьтесь со всеми направлениями школы и кружками!\nПолезные ссылки для поступления:", "https://vk.com/yumsh.spbu", "Официальная группа ЮМШ"))
        items.add(item(4,"kot", "_hb", "8-й химико-биологический класс", scc, "", "?"))
        items.add(item(5,"c", "_hbb", "9-й химико-биологический класс", scc, "https://vk.com/chem_bio533_23", "Группа класса в ВК"))
        items.add(item(6,"c", "ten_hb", "10-й химико-биологический класс", scc, "https://vk.com/chem_bio533_22", "Группа класса в ВК"))
        items.add(item(5,"c", "eleven_hb", "11-й химико-биологический класс", "", "", "Появится в следующем учебном году"))
        items.add(item(7,"c", "eight_g", "8-й гуманитарный класс", sc, "https://vk.com/club226046049", "Группа класса в ВК"))
        items.add(item(8,"c", "nine_g", "9-й гуманитарный класс", sc, "https://vk.com/club220927072", "Группа класса в ВК"))
        items.add(item(9,"c", "ten_g", "10-й гуманитарный класс", sc, "https://vk.com/club213675027", "Группа класса в ВК"))
        items.add(item(10,"c", "eleven_g", "11-й гуманитарный класс", sc, "https://vk.com/club204982646", "Группа класса в ВК"))

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