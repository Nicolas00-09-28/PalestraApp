package com.example.palestraapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import kotlinx.android.synthetic.main.activity_progressi.*

class ProgressiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progressi)

        val values = listOf(
            Entry(1f, 10f),
            Entry(2f, 12f),
            Entry(3f, 15f),
            Entry(4f, 18f),
            Entry(5f, 20f)
        )

        val dataSet = LineDataSet(values, "Progressi")
        dataSet.color = resources.getColor(android.R.color.holo_blue_dark)
        dataSet.lineWidth = 3f

        progressChart.data = LineData(dataSet)
        progressChart.invalidate()
    }
}