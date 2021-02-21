package com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.R
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.databinding.ActivityViewModelBinding
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.utils.Sumar

class ViewModelActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewModelBinding
    var resultado: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpView()
    }

    private fun setUpView(){

        binding.tvSumar.text = "$resultado"

        binding.btSumar.setOnClickListener {

            resultado = Sumar.sumar(resultado)
            binding.tvSumar.text = "$resultado"
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG1", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG1", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG1", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG1", "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG1", "onDestroy()")
    }
}