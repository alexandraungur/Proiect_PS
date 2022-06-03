package com.example.fragranceshop

import android.telecom.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("getProducts")
    fun getData(): retrofit2.Call<List<MyDataItem>>




}



