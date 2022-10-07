package com.alonsogallego.psp.ut02.ex01.data.remote

import com.alonsogallego.psp.ut02.ex01.data.remote.models.UserApiModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiEndPoints {

    @GET("users")
    fun getUsers(): Call<List<UserApiModel>>

    @GET("users/{userId}")
    fun getUser(@Path("userId") userId: Int): Call<UserApiModel>
}