package com.example.android.practice_application.model.services

import com.example.android.practice_application.model.data.Rocket
import retrofit2.Response
import retrofit2.http.GET

interface PracticeService {

    @GET("v4/rockets")
    suspend fun getRockets(): Response<List<Rocket>>
}