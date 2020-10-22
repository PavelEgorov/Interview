package com.first.polygonteam.interview.lesson2

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime

internal class ST500Adapter(val sensorTemperature: SensorTemperature, override val idСorrection: Int) : SensorAdapter() {

    override fun getId() =  sensorTemperature.identifier() + idСorrection

    override fun getTemperature() = sensorTemperature.temperature().toFloat()

    override fun getHumidity() = null

    override fun getPressure() = null

    @RequiresApi(Build.VERSION_CODES.O)
    override fun getDateTime() =
            LocalDateTime.of(sensorTemperature.year(),0,0,0,0,0)
                .plusDays(sensorTemperature.day().toLong())
                .plusSeconds(sensorTemperature.second().toLong())
    ///int year, int month, int dayOfMonth, int hour, int minute, int second
}