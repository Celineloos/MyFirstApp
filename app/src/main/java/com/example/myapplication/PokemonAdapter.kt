package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class PokemonAdapter(private val dataSet: Array<Pokemon>,  private val mListener: AdapterView.OnItemClickListener?) : RecyclerView.Adapter<PokemonViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): PokemonViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.pokemon_item, viewGroup, false)

        return PokemonViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: PokemonViewHolder, position: Int) {
        val p = dataSet[position]
        viewHolder.imageView.setImageResource(p.id)
        viewHolder.textView.text = p.name
    }

    override fun getItemCount() = dataSet.size
}