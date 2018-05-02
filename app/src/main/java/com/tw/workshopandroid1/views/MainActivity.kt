package com.tw.workshopandroid1.views

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tw.workshopandroid1.R
import com.tw.workshopandroid1.model.Place
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAdd.setOnClickListener {
            val intent = Intent(this, FormPlace::class.java)
            startActivity(intent)
        }

        val place = intent.getSerializableExtra("place") as? Place
        name.text = place?.name
        description.text = place?.description

    }
}
