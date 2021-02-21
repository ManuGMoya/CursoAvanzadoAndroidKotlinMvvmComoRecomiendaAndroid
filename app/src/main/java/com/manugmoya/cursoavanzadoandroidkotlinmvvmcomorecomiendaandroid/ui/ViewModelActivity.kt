package com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.databinding.ActivityViewModelBinding
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.utils.Sumar
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.viewmodel.SumarViewModel

class ViewModelActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewModelBinding
    private lateinit var sumarViewModel: SumarViewModel
    var resultado: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpView()
    }

    private fun setUpView() {

        // Instancia del viewModel
        sumarViewModel = ViewModelProvider(this).get(SumarViewModel::class.java)

        binding.tvSumar.text = "$resultado"
        binding.tvSumarViewModel.text = "${sumarViewModel.resultado}"

        binding.btSumar.setOnClickListener {

            resultado = Sumar.sumar(resultado)
            binding.tvSumar.text = "$resultado"

            sumarViewModel.resultado = Sumar.sumar(sumarViewModel.resultado)
            binding.tvSumarViewModel.text = "${sumarViewModel.resultado}"
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