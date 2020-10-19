package com.first.polygonteam.interview.lesson1

// Реализация интерфейса ConvertTo.
// Перевод в Цельсии из Фаренгейта.
internal class ConvertToCelsius : ConvertTo {
    override fun Do(sourceValue: Float) =  ((sourceValue - 32) / 1.8).toFloat() // Вычисление Цельсия
}