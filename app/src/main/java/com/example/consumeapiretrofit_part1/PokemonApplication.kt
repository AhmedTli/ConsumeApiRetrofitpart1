package com.example.consumeapiretrofit_part1

import android.app.Application
import com.example.consumeapiretrofit_part1.data.AppContainer
import com.example.consumeapiretrofit_part1.data.DefaultAppContainer


class PokemonApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}