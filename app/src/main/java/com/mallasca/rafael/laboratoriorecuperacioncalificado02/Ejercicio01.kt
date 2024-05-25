package com.mallasca.rafael.laboratoriorecuperacioncalificado02
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ejercicio01 : AppCompatActivity() {
    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio01)

        imageView = findViewById(R.id.imageView)

        val buttonMostrar = findViewById<Button>(R.id.buttonMostrar)
        val buttonOcultar = findViewById<Button>(R.id.buttonOcultar)

        buttonMostrar.setOnClickListener {
            imageView.visibility = View.VISIBLE
        }

        buttonOcultar.setOnClickListener {
            imageView.visibility = View.GONE
        }
    }
}