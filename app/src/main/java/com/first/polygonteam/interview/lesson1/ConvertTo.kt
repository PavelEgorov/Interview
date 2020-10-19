package com.first.polygonteam.interview.lesson1

// Интерфейс преобразования значений
// Чтобы сделать новое преобразование, достаточно реализовать этот интерфейс
internal interface ConvertTo {
    fun Do(sourceValue: Float): Float // Преобразовать
}