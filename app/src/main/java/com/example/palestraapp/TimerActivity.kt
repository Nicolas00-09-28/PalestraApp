package com.example.palestraapp

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TimerActivity : AppCompatActivity() {

    private var timer: CountDownTimer? = null
    private var timeLeft = 30000L // 30 secondi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)

        val timerText = findViewById<TextView>(R.id.timerText)
        val startBtn = findViewById<Button>(R.id.startBtn)
        val pauseBtn = findViewById<Button>(R.id.pauseBtn)
        val resetBtn = findViewById<Button>(R.id.resetBtn)

        fun updateText() {
            val seconds = (timeLeft / 1000).toInt()
            timerText.text = "00:${String.format("%02d", seconds)}"
        }

        startBtn.setOnClickListener {
            timer?.cancel()
            timer = object : CountDownTimer(timeLeft, 1000) {
                override fun onTick(ms: Long) {
                    timeLeft = ms
                    updateText()
                }

                override fun onFinish() {
                    timerText.text = "FINITO!"
                }
            }.start()
        }

        pauseBtn.setOnClickListener {
            timer?.cancel()
        }

        resetBtn.setOnClickListener {
            timer?.cancel()
            timeLeft = 30000L
            updateText()
        }

        updateText()
    }
}