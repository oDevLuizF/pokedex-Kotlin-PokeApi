package com.example.pokedexs1.view

import android.annotation.SuppressLint
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedexs1.R
import com.example.pokedexs1.domain.Pokemon
import org.w3c.dom.Text


class PokemonAdapter(
    val items: List<Pokemon>
) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pokemon_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bindView(item)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        @SuppressLint("SetTextI18n")
        fun bindView(item: Pokemon) = with(itemView){
                val ivPokemon = findViewById<ImageView>(R.id.ivPokemon)
                val tvNumber = findViewById<TextView>(R.id.tvNumber)
                val tvName = findViewById<TextView>(R.id.tvName)
                val tvType1 = findViewById<TextView>(R.id.tvType1)
                val tvType2 = findViewById<TextView>(R.id.tvType2)

                // TODO: Load image with Glide

                tvNumber.text = "N ${item.formatedNumber}"
                tvName.text = item.name
                tvType1.text = item.types[0].name
                if (item.types.size > 1){
                    tvType2.visibility = View.VISIBLE
                    tvType2.text = item.types[1].name
                }else{
                    tvType2.visibility = View.GONE
                }
            }
        }

    }


