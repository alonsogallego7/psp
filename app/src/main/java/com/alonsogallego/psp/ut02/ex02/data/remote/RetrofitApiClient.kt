package com.alonsogallego.psp.ut02.ex02.data.remote

import com.alonsogallego.psp.ut02.ex01.data.remote.models.UserApiModel
import com.alonsogallego.psp.ut02.ex02.data.remote.ApiEndPoints
import com.alonsogallego.psp.ut02.ex02.data.remote.models.AlertApiModel
import com.alonsogallego.psp.ut02.ex02.data.remote.models.AlertResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitApiClient {
    private val urlEndPoint = "https://jsonplaceholder.typicode.com/"
    private var apiEndPoints: ApiEndPoints

    init {
        apiEndPoints = buildApiEndPoints()
    }

    private fun buildClient(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(urlEndPoint)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun buildApiEndPoints(): ApiEndPoints {
        return buildClient().create(ApiEndPoints::class.java)
    }

    fun getAlerts(): List<AlertResponse>{
        val callAlerts = apiEndPoints.getAlerts() //Llamada
        val response = callAlerts.execute() //Ejecución de la llamada
        return if (response.isSuccessful) {
            val alerts = response.body()
            alerts ?: emptyList()
        } else{
            emptyList()
        }
    }

    fun getAlert(alertId: Int): AlertApiModel?{
        val alertCall = apiEndPoints.getAlert(alertId)
        val response = alertCall.execute()
        return if (response.isSuccessful) {
            response.body()
        } else {
            null
        }
    }
}