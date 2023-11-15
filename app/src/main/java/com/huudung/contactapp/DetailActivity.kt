package com.huudung.contactapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val id = intent.getStringExtra("id")
        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val email = intent.getStringExtra("email")
        findViewById<TextView>(R.id.ID).text = "ID:\n" + id
        findViewById<TextView>(R.id.FullName).text = "Tên:\n" + name
        findViewById<TextView>(R.id.Number).text = "Phone number:\n" + phone
        findViewById<TextView>(R.id.Email).text = "Email:\n" + email

    }
}