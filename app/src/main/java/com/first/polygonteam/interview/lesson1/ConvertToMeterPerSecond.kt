package com.first.polygonteam.interview.lesson1

class ConvertToMeterPerSecond : ConvertTo {
    override fun Do(sourceValue: Float) = (sourceValue * 0.28).toFloat() // Вычисление метров в секунду
}