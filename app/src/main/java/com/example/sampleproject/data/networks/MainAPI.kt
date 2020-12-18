package com.example.sampleproject.data.networks


import android.util.Log
import com.example.sampleproject.other.Constants.BASE_URL
import com.example.sampleproject.other.Constants.URL_GET
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface MainAPI {

    @GET(URL_GET)
    suspend fun getID(): Response<Array<String>>

}