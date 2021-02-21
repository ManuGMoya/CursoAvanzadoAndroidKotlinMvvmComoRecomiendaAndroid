package com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.databinding.ActivityUserViewModelBinding
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.utils.User
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.viewmodel.UserViewModel

class UserViewModelActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserViewModelBinding
    var userList: MutableList<User> = mutableListOf()
    private lateinit var userViewmodel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpView()
    }

    private fun setUpView() {

        userViewmodel = ViewModelProvider(this).get(UserViewModel::class.java)

        binding.btSalvar.setOnClickListener {
            val user = User()
            user.edad = binding.etEdad.text.toString()
            user.nombre = binding.etNombre.text.toString()

            userList.add(user)
            userViewmodel.addUser(user)
        }

        binding.btVer.setOnClickListener {
            var texto = ""

            userList.forEach {
                texto += it.nombre + " " + it.edad + "\n"
            }

            binding.tvUser.text = texto

            texto = ""
            userViewmodel.userList.forEach {
                texto += it.nombre + " " + it.edad + "\n"
            }

            binding.tvUserViewModel.text = texto
        }

    }

}