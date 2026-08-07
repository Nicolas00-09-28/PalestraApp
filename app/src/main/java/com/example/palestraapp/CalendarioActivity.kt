package com.example.palestraapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.datepicker.MaterialDatePicker

class CalendarioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendario)

        val btn = findViewById<Button>(R.id.openCalendarBtn)

        btn.setOnClickListener {
            val picker = MaterialDatePicker.Builder.datePicker()
                .setTitleText("Seleziona una data")
                .build()

            picker.show(supportFragmentManager, "DATE_PICKER")
        }
    }
}