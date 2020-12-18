package com.example.sampleproject.di

import com.example.sampleproject.data.networks.MainAPI
import com.example.sampleproject.other.Constants
import com.google.firebase.database.FirebaseDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideFirebaseDatabase() = FirebaseDatabase.getInstance()


    @Singleton
    @Provides
    fun provideMainAPI (): MainAPI = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(MainAPI::class.java)




}