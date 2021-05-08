package com.example.tata_surya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detail : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_IMAGE = "extra_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.title = "Detail Title"

        val detailName: TextView = findViewById(R.id.judul)
        val detailDetil: TextView = findViewById(R.id.detil)
        val detailImg: ImageView = findViewById(R.id.image)

        val dataName = intent.getStringExtra(EXTRA_NAME)
        val dataDetil = intent.getStringExtra(EXTRA_DETAIL)
        val dataimage = intent.getIntExtra(EXTRA_IMAGE, 0)

        detailName.text = dataName
        detailDetil.text = dataDetil
        detailImg.setImageResource(dataimage)
    }
}