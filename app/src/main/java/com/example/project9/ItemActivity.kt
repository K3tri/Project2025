package com.example.project9

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ItemActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_item)




        val linkToClass: TextView = findViewById(R.id.link_to_class)
        val title_one: TextView = findViewById(R.id.item_title_one)
        val scedual: TextView = findViewById(R.id.text_view_scedual)
        //val urll: TextView = findViewById(R.id.text_view_url)

        val textView = findViewById<TextView>(R.id.text_view_scedual)

//        url.text = intent.getStringExtra("URL")
//
//        // Устанавливаем текст гиперссылкой
//        url.text = Html.fromHtml("<a href=\"$url\">$url</a>")
//
//        // Делаем текст кликабельным
//        url.movementMethod = LinkMovementMethod.getInstance()

        val url = intent.getStringExtra("URL")
        val vk = intent.getStringExtra("VK")
        val title = intent.getStringExtra("itemTitle")

        // Находим TextView и устанавливаем текст
        val textView_one: TextView = findViewById(R.id.text_view_url)

        // Устанавливаем текст гиперссылкой
        textView_one.text = Html.fromHtml("<a href=\"$url\">$vk</a>")

        // Делаем текст кликабельным
        textView_one.movementMethod = LinkMovementMethod.getInstance()

        if (title == "Поступающим") {
            val post: TextView = findViewById(R.id.text_view_links)
            post.text = Html.fromHtml("<a href=\"https://yumsh.ru/cms/classes/5class\">В 5-ые математико-литературные классы</a>")
            post.movementMethod = LinkMovementMethod.getInstance()

            val postt: TextView = findViewById(R.id.text_view_linkss)
            postt.text = Html.fromHtml("<a href=\"https://yumsh.ru/cms/classes/class8\">В 8-10-ые математические классы</a>")
            postt.movementMethod = LinkMovementMethod.getInstance()

            val posttt: TextView = findViewById(R.id.text_view_linksss)
            posttt.text = Html.fromHtml("<a href=\"https://vk.com/chembio533\">В химико-биологические классы</a>")
            posttt.movementMethod = LinkMovementMethod.getInstance()

            val postttt: TextView = findViewById(R.id.text_view_linkssss)
            postttt.text = "(В группе ХимЛаб/ХимБио публикуются даты вступительных испытаний, а также информация для поступивших.)"
            postttt.movementMethod = LinkMovementMethod.getInstance()
        }


        title_one.text = intent.getStringExtra("itemTitle")
        scedual.text = intent.getStringExtra("itemScedual")


        linkToClass.setOnClickListener {
            val intent = Intent(this, ItemsActivity::class.java)
            startActivity(intent)
        }
    }
}