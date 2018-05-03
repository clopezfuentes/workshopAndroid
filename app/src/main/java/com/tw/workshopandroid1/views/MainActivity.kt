package com.tw.workshopandroid1.views

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.tw.workshopandroid1.R
import com.tw.workshopandroid1.model.Place
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val REGISTER_ACTIVITY_ID = 1
    }

    var placeLista : MutableList<Place> = mutableListOf(
            Place("La casa del chef","La mejor comida peruana"),
            Place("Mi casa","La mejorcita comidaaa de mamá")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAdd.setOnClickListener {
            val intent = Intent(this, FormPlace::class.java)
            startActivityForResult(intent, REGISTER_ACTIVITY_ID)
        }

        placeList.layoutManager = LinearLayoutManager(this)
        placeList.adapter = PlaceAdapter(placeLista)


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REGISTER_ACTIVITY_ID) {
            val place = data?.getSerializableExtra("place") as Place
            placeLista.add(place)
            placeList.adapter.notifyDataSetChanged()//Se actualiza la lista

            Toast.makeText(this, "volvió bien!" + place.name, Toast.LENGTH_SHORT).show()
        }

    }
}
