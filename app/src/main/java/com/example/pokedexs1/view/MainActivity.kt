package com.example.pokedexs1.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedexs1.R
import com.example.pokedexs1.domain.Pokemon
import com.example.pokedexs1.domain.PokemonType

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rvPokemons)


           val charmander = Pokemon(
                "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/004.png",
                4,
                "Charmander",
                arrayListOf(
                    PokemonType("Fire")
                )
           )
             val pokemons = arrayListOf(
                 charmander, charmander, charmander, charmander, charmander
             )


        val layourManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layourManager
        recyclerView.adapter = PokemonAdapter(pokemons)

}

}

