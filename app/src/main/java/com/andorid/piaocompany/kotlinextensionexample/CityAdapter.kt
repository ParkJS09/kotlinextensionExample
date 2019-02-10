package com.andorid.piaocompany.kotlinextensionexample

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_city.view.*

class CityAdapter : RecyclerView.Adapter<CityAdapter.Holder>() {

    private val cities = listOf("Seoul" to "SEO", "Tokyo" to "TOK", "Mountain View" to "MTV",
            "Singapore" to "SIN", "New York" to "NYC")

    override fun onCreateViewHolder(parent: ViewGroup, position: Int) = Holder(parent)

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val (city, code) = cities[position]

        with(holder.itemView) {
            tv_city_name.text = city
            tv_city_code.text = code
        }
    }

    override fun getItemCount(): Int = cities.size

    inner class Holder(parent: ViewGroup) : RecyclerView.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_city, parent, false))
}