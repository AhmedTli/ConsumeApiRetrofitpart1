package com.example.consumeapiretrofit_part1.network

import com.example.consumeapiretrofit_part1.model.Pokemon
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET



private var BASE_URL = "https://tyradex.vercel.app/api/v1/"

interface ApiService{
    @GET("pokemon")
    suspend fun  getAllPokemon():List<Pokemon>
}

private val retrofit: Retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create()) // For JSON parsing
    .baseUrl(BASE_URL)
    .build()

    val retrofitService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }