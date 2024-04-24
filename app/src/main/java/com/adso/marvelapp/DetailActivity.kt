package com.adso.marvelapp


import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.adso.marvelapp.databinding.ActivityDetailBinding
import com.adso.marvelapp.databinding.ActivityMainBinding
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        cargarDetalle()
    }
    fun loadImage(url: String) {
        Glide.with(this).load(url).into(binding.ivAvatar)
    }
    fun cargarDetalle(){
        var nombre: String = intent.getStringExtra("nombre").toString()
        binding.tvSuperhero.text = nombre
        var nombreReal: String = intent.getStringExtra("nombreReal").toString()
        binding.tvRealName.text = nombreReal
        var publisher: String = intent.getStringExtra("publisher").toString()
        binding.tvPublisher.text = publisher
        var foto: String = intent.getStringExtra("imagen").toString()
        loadImage(foto)
    }
}