package com.alonsogallego.psp.ut02.ex02master.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alonsogallego.psp.R
import com.alonsogallego.psp.ut02.ex02master.data.remote.RetrofitApiClient

class Ut02Ex02Activity : AppCompatActivity() {

    val apiClient = RetrofitApiClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut02_ex2)

        Thread {
            val alerts = apiClient.getAlerts()
            Log.d("@dev", "Alertas: $alerts")
        }.start()

        Thread {
            val alert = apiClient.getAlert(3053125)
            Log.d("@dev", "Alerta: $alert")
        }.start()

    }
}