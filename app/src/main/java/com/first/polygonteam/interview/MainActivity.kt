package com.first.polygonteam.interview

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.first.polygonteam.interview.lesson1.ConvertToFahrenheit
import com.first.polygonteam.interview.lesson1.Converter


class MainActivity : AppCompatActivity() {
    private var sourceText // Элемент с входным значением, которое надо сконвертировать
            : EditText? = null
    private var destText // Элемент с результирующим значением
            : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sourceText = findViewById(R.id.celsiusValue) as EditText
        destText = findViewById(R.id.fahrenheitValue) as EditText

        val btn = findViewById(R.id.toFahrenheitButton) as Button
        btn.setOnClickListener({
            // получить входное значение
            val sourceValue = sourceText!!.text.toString().toFloat()
            // инстанцировать конвертер
            val converter = Converter(sourceValue)
            // преобразовать, обратите внимание на параметр ConvertToFahrenheit
            val destValue: Float = converter.Convert(ConvertToFahrenheit()).GetResult()
            // записать результат в элемент
            destText!!.setText(String.format("%.02f", destValue))
        })
    }
}