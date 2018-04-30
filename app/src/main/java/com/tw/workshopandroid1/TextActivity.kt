package com.tw.workshopandroid1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_text.*

class TextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)

        button.setOnClickListener {
            val textName = editText.text.toString()
            val intent = Intent(this, ShowTextActivity::class.java)
            intent.putExtra("textName", textName)
            startActivity(intent)
        }
    }
}
