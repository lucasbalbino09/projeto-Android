package com.example.myapplication

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("produtos")
    fun getProdutos(): Call<List<Produto>>
}
