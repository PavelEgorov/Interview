package com.first.polygonteam.interview.lesson1

// Реализация интерфейса ConvertTo.
// Перевод в Мили из КМ.
internal class ConvertToMile : ConvertTo {
    override fun Do(sourceValue: Float) = (sourceValue * 0.62137).toFloat() // Вычисление миль
}