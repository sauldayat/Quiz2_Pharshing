package com.example.football.network

import com.example.football.model.Football
import retrofit2.Call
import retrofit2.http.GET

interface FootballApiService {
    @GET("v4/areas/2267")
    fun getFootball(): Call<Football>
}