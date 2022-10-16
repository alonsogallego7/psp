package com.alonsogallego.psp.ut02.ex02master.data.remote

import com.alonsogallego.psp.ut02.ex02master.data.remote.models.AlertDetailApiModel
import com.alonsogallego.psp.ut02.ex02master.data.remote.models.AlertsApiModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiEndPoints {

    @GET("alerts")
    fun getAlerts(): Call<AlertsApiModel>

    @GET("alerts/{alertId}")
    fun getAlert(@Path("alertId") alertId: Int): Call<AlertDetailApiModel>
}