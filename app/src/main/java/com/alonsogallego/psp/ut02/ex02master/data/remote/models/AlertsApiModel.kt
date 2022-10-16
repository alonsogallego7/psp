package com.alonsogallego.psp.ut02.ex02master.data.remote.models

data class AlertsApiModel(val statusCode: Int, val data: List<AlertApiModel>){
data class AlertApiModel (val alert_id:String, val title:String, val summary:String, val type:String, val date:String)}