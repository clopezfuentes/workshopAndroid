package com.tw.workshopandroid1.views

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tw.workshopandroid1.R
import com.tw.workshopandroid1.model.Place
import kotlinx.android.synthetic.main.activity_form_place.*

class FormPlace : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_place)

        buttonRegister.setOnClickListener {
            val name = name.text.toString()
            val description = description.text.toString()
            val place = Place(name,description)

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("place",place)
            startActivity(intent)

        }

    }
}
