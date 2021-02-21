package com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.databinding.ActivityMainBinding
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.ui.LiveDataActivity
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.ui.UserViewModelActivity
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.ui.ViewModelActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpView()
    }

    private fun setUpView() {

        binding.btViewModel.setOnClickListener {
            startActivity(Intent(applicationContext, ViewModelActivity::class.java))
        }


        binding.btUserViewModel.setOnClickListener {
            startActivity(
                Intent(applicationContext, UserViewModelActivity::class.java)
            )
        }


        binding.btLiveData.setOnClickListener {
            startActivity(Intent(applicationContext, LiveDataActivity::class.java))
        }


/*
        btDataBinding.setOnClickListener {
            startActivity(Intent(applicationContext, DataBindingActivity::class.java))
        }


        btDBLABinding.setOnClickListener {
            startActivity(Intent(applicationContext, DBLDActivity::class.java))
        }*/

    }
}