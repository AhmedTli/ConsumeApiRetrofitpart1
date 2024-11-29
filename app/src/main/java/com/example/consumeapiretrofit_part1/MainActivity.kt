package com.example.consumeapiretrofit_part1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.consumeapiretrofit_part1.ui.theme.ConsumeApiRetrofitpart1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ConsumeApiRetrofitpart1Theme {
              PokApp()
                }
            }
        }
    }


