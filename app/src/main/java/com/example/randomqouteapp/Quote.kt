package com.example.randomqouteapp

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Quote(
    @Json(name = "quote") val quote: String,
    @Json(name = "author") val author:String,
    @Json(name = "category") val category: String
)