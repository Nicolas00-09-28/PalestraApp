package com.example.palestraapp

import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animClick = AnimationUtils.loadAnimation(this, R.anim.card_click)
        val animRelease = AnimationUtils.loadAnimation(this, R.anim.card_release)

        val cardA = findViewById<LinearLayout>(R.id.cardA)
        cardA.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> v.startAnimation(animClick)
                MotionEvent.ACTION_UP -> {
                    v.startAnimation(animRelease)
                    startActivity(Intent(this, AllenamentoAActivity::class.java))
                }
            }
            true
        }

        val cardB = findViewById<LinearLayout>(R.id.cardB)
        cardB.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> v.startAnimation(animClick)
                MotionEvent.ACTION_UP -> {
                    v.startAnimation(animRelease)
                    startActivity(Intent(this, AllenamentoBActivity::class.java))
                }
            }
            true
        }

        val cardC = findViewById<LinearLayout>(R.id.cardC)
        cardC.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> v.startAnimation(animClick)
                MotionEvent.ACTION_UP -> {
                    v.startAnimation(animRelease)
                    startActivity(Intent(this, AllenamentoCActivity::class.java))
                }
            }
            true
        }

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> true
                R.id.nav_progressi -> {
                    startActivity(Intent(this, ProgressiActivity::class.java))
                    true
                }
                R.id.nav_timer -> {
                    startActivity(Intent(this, TimerActivity::class.java))
                    true
                }
                R.id.nav_calendario -> {
                    startActivity(Intent(this, CalendarioActivity::class.java))
                    true
                }
                else -> false
            }
        }
    }
}
