package com.example.consumeapiretrofit_part1.data

import com.example.consumeapiretrofit_part1.model.Pokemon
import com.example.consumeapiretrofit_part1.network.ApiService

interface PokemonRepository {
    suspend fun  getAllPokemon():List<Pokemon>
}
class NetworkPokemonRepository(private val pokemonApiService: ApiService
):PokemonRepository{
    override suspend fun getAllPokemon(): List<Pokemon> {
        return pokemonApiService.getAllPokemon()
    }

}