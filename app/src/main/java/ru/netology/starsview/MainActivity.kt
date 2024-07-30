package ru.netology.starsview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.netology.starsview.ui.StatsView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<StatsView>(R.id.statsView)
        view.postDelayed(
            {
                view.data = listOf(
                    500F,
                    500F,
                    500F,
                    500F,
                )
            }, 3000
        )
    }
}