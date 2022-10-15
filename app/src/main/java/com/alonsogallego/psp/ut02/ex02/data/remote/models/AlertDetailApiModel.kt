package com.alonsogallego.psp.ut02.ex02.data.remote.models

data class AlertDetailApiModel (val statusCode: Int, val data: Data) {
data class Data (val id: Int, val alert_id: String, val title: String, val type: Int, val date: String, val summary: String, val body: String, val source: String, val files: List<File>){
data class File (val id: Int, val alert_id: String, val name: String, val url: String)}}