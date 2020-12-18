package com.example.sampleproject.data.repositories

import android.util.Log
import com.example.sampleproject.data.networks.MainAPI
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val api: MainAPI
) {

    var str = ""

    suspend fun getId(): ArrayList<String> {
        val ids = ArrayList<String>()

        val response = api.getID()
        if (response.isSuccessful) {

            for(id in response.body()!!){
                str += "$id "
                ids.add(id)
            }
        }
        Log.d("responseFromRetrofit", str)
        return ids
    }
}