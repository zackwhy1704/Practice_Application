package com.example.android.practice_application.model.di

import com.example.android.practice_application.model.services.PracticeService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
class PracticeModule {
    @Provides
    fun provideSpaceService(): PracticeService {
        return Retrofit.Builder()
            .baseUrl("https://api.spacexdata.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PracticeService::class.java)
    }

}