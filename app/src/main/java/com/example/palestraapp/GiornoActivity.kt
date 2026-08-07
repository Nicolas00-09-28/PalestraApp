package com.example.palestraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class GiornoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_giorno)

        val txtDay = findViewById<TextView>(R.id.txtDay)
        val btnAllenamento = findViewById<Button>(R.id.btnAllenamento)

        val dateFormat = SimpleDateFormat("EEEE dd MMMM yyyy", Locale.ITALIAN)
        val currentDate = dateFormat.format(Date())

        txtDay.text = "Oggi è: $currentDate"

        btnAllenamento.setOnClickListener {
            val intent = Intent(this, AllenamentoActivity::class.java)
            startActivity(intent)
        }
    }
}