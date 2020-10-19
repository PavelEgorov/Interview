package com.first.polygonteam.interview.lesson1

// Реализация интерфейса ConvertTo.
// Перевод в Фаренгейт из Цельсия.
internal class ConvertToFahrenheit : ConvertTo {
    override fun Do(sourceValue: Float)= (sourceValue * 1.8 + 32).toFloat() // Вычисление Фаренгейт
}