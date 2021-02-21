package com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.databinding.ActivityUserViewModelBinding
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.utils.User

class UserViewModelActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserViewModelBinding
    var userList: MutableList<User> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpView()
    }

    private fun setUpView() {

        binding.btSalvar.setOnClickListener {
            val user = User()
            user.edad = binding.etEdad.text.toString()
            user.nombre = binding.etNombre.text.toString()

            userList.add(user)
        }

        binding.btVer.setOnClickListener {
            var texto = ""

            userList.forEach {
                texto += it.nombre + " " + it.edad + "\n"
            }

            binding.tvUser.text = texto
        }

    }

}