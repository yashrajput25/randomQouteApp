package com.example.randomqouteapp

import retrofit2.http.GET

interface QuoteApi {
    @GET("/v1/quotes")
    suspend fun getRandomQuotes(): Quote
}