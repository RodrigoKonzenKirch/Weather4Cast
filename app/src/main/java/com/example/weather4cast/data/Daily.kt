package com.example.weather4cast.data

data class Daily(
    val apparentTemperatureMax: List<Double>,
    val apparentTemperatureMin: List<Double>,
    val sunrise: List<String>,
    val sunset: List<String>,
    val temperature2mMax: List<Double>,
    val temperature2mMin: List<Double>,
    val time: List<String>,
    val uvIndexMax: List<Double>,
    val windDirection10mDominant: List<Int>,
    val windSpeed10mMax: List<Double>
)