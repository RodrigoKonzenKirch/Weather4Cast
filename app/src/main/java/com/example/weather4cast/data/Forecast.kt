package com.example.weather4cast.data

data class Forecast(
    val daily: Daily,
    val dailyUnits: DailyUnits,
    val elevation: Double,
    val generationTimeMs: Double,
    val latitude: Double,
    val longitude: Double,
    val timezone: String,
    val timezoneAbbreviation: String,
    val utcOffsetSeconds: Int
)