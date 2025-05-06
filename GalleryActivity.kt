package com.example.utskarinanrfa

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class GalleryActivity : AppCompatActivity() {

    private val recipes = listOf(
        "Nasi Goreng", "Sate Ayam", "Rendang", "Bakso", "Mie Goreng",
        "Soto", "Gado-Gado", "Ayam Geprek", "Tumis Kangkung"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        val gridView = findViewById<GridView>(R.id.gridView)
        gridView.adapter = ArrayAdapter(this, R.layout.item_gallery, R.id.tvItem, recipes)
    }
}
