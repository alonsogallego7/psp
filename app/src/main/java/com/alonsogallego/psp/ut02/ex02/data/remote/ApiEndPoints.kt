package com.alonsogallego.psp.ut02.ex02.data.remote

import com.alonsogallego.psp.ut02.ex01.data.remote.models.UserApiModel
import com.alonsogallego.psp.ut02.ex02.data.remote.models.AlertApiModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiEndPoints {

    @GET("alerts")
    fun getAlerts(): Call<List<AlertApiModel>>

    @GET("alerts/{alertId}")
    fun getAlert(@Path("userId") alertId: Int): Call<AlertApiModel>
}