package com.example.myapplication_rank

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication_rank.R

class MainActivity : AppCompatActivity() {

    private lateinit var rankingButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rankingButton = findViewById(R.id.buttonRanking)
        rankingButton.setOnClickListener {
            startActivity(Intent(this, RankingActivity::class.java))
        }
    }
}
