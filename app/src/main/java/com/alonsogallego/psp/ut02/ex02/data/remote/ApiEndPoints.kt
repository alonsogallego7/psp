package com.alonsogallego.psp.ut02.ex02.data.remote

import com.alonsogallego.psp.ut02.ex02.data.remote.models.AlertApiModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiEndPoints {

    @GET("https://plagricola.sitehub.es/api/public/alerts")
    fun getAlerts(): Call<List<AlertApiModel>>

    @GET("https://plagricola.sitehub.es/api/public/alerts/{alert_id}")
    fun getAlert(@Path("alert_id") alertId: Int): Call<AlertApiModel>
}