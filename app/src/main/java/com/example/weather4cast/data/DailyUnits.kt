package com.example.weather4cast.data

data class DailyUnits(
    val apparentTemperatureMax: String,
    val apparentTemperatureMin: String,
    val sunrise: String,
    val sunset: String,
    val temperature2mMax: String,
    val temperature2mMin: String,
    val time: String,
    val uvIndexMax: String,
    val windDirection10mDominant: String,
    val windSpeed10mMax: String
)