package com.tw.workshopandroid1.views

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tw.workshopandroid1.R
import com.tw.workshopandroid1.model.Place
import kotlinx.android.synthetic.main.place_item.view.*

class PlaceAdapter(var placeList: List<Place>) : RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder>() {

    override fun getItemCount(): Int {
        return placeList.size
    }

    class PlaceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(place: Place) {
            //itemView.findViewById<TextView>(R.id.nombrePlace).text = place.name
            //itemView.findViewById<TextView>(R.id.descripcionPlace).text = place.description
            itemView.nombrePlace.text = place.name
            itemView.descripcionPlace.text = place.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.place_item, parent, false)
        return PlaceViewHolder(item)
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        holder.bind(placeList[position])
    }
}