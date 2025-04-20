package com.example.project9



import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity




class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val userLogin: EditText = findViewById(R.id.user_login)
        val userEmail: EditText = findViewById(R.id.user_email)
        val userPass: EditText = findViewById(R.id.user_pass)
        val button: Button = findViewById(R.id.button_reg)
        val linkToAuth: TextView = findViewById(R.id.link_to_auth)
//        val login = userLogin.text.toString().trim()
//        val email = userEmail.text.toString().trim()
//        val pass = userPass.text.toString().trim()

        val preferences: SharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
        val isFirstRun = preferences.getBoolean("isFirstRun", true)
        if (!isFirstRun && a != 1 && b != 1)  {
            // Если это не первый запуск, сразу переходим к основному экрану
            val intent = Intent(this, ItemsActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            a = -1
            b = -1
        }

        //(isFirstRun &&

        linkToAuth.setOnClickListener {
            val login = userLogin.text.toString().trim()
            val email = userEmail.text.toString().trim()
            val pass = userPass.text.toString().trim()
            if  (isFirstRun && (login == "" || email == "" || pass == "")) {
                Toast.makeText(this, "Не все поля заполнены", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, AuthActivity::class.java)
                startActivity(intent)
            }
        }



        button.setOnClickListener {
            val login = userLogin.text.toString().trim()
            val email = userEmail.text.toString().trim()
            val pass = userPass.text.toString().trim()

            if (login == "" || email == "" || pass == "")
                Toast.makeText(this, "Не все поля заполнены", Toast.LENGTH_LONG).show()
            else {
                val user = User(login, email, pass)

                val db = DbHelper(this, null)
                db.addUser(user)
                Toast.makeText(this, "Пользователь $login добавлен", Toast.LENGTH_LONG).show()

//                userLogin.text.clear()
//                userEmail.text.clear()
//                userPass.text.clear()
            }
        }


    }
}