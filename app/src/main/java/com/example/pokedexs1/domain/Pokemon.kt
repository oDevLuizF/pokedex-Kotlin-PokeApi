package com.example.pokedexs1.domain

class Pokemon (
    val imageUrl : String,
    val number: Int,
    val name: String,
    val types: List<PokemonType>


)
{
    val formatedNumber = number.toString().padStart(3, '0')
}