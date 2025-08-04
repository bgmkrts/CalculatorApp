package com.begumkaratas.hesapmakinesiodev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.begumkaratas.hesapmakinesiodev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var numara1: Double? = null
    var numara2: Double? = null
    var sonuc: Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.topla.setOnClickListener { topla() }
        binding.cikar.setOnClickListener { cikar() }
        binding.carp.setOnClickListener { carp() }
        binding.bol.setOnClickListener { bol() }
    }

    private fun topla() {
        numara1 = binding.editTextNumber.text.toString().toDoubleOrNull()
        numara2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
        if (numara1 != null && numara2 != null) {
            sonuc = numara1!! + numara2!!
            binding.soncText.text = "Sonuç: $sonuc"
        } else {
            binding.soncText.text = "Numaraları giriniz"
        }
    }

    private fun cikar() {
        numara1 = binding.editTextNumber.text.toString().toDoubleOrNull()
        numara2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
        if (numara1 != null && numara2 != null) {
            sonuc = numara1!! - numara2!!
            binding.soncText.text = "Sonuç: $sonuc"
        } else {
            binding.soncText.text = "Numaraları giriniz"
        }
    }

    private fun carp() {
        numara1 = binding.editTextNumber.text.toString().toDoubleOrNull()
        numara2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
        if (numara1 != null && numara2 != null) {
            sonuc = numara1!! * numara2!!
            binding.soncText.text = "Sonuç: $sonuc"
        } else {
            binding.soncText.text = "Numaraları giriniz"
        }
    }

    private fun bol() {
        numara1 = binding.editTextNumber.text.toString().toDoubleOrNull()
        numara2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
        if (numara1 != null && numara2 != null) {
            if (numara2 == 0.0) {
                binding.soncText.text = "Sıfıra bölünemez"
            } else {
                sonuc = numara1!! / numara2!!
                binding.soncText.text = "Sonuç: $sonuc"
            }
        } else {
            binding.soncText.text = "Numaraları giriniz"
        }
    }
}
