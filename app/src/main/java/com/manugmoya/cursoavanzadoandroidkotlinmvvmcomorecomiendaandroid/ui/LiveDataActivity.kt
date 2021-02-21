package com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.databinding.ActivityLiveDataBinding
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.utils.User
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.viewmodel.LiveDataViewModel

class LiveDataActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLiveDataBinding
    private lateinit var liveDataViewModel: LiveDataViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLiveDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpView()
    }

    private fun setUpView() {

        liveDataViewModel = ViewModelProvider(this).get(LiveDataViewModel::class.java)

        binding.btSave.setOnClickListener {

            when (liveDataViewModel.numero) {
                0 -> {
                    val user = User()
                    user.nombre = "Manuel"
                    user.edad = "40"
                    liveDataViewModel.addUser(user)
                }
                1 -> {
                    val user = User()
                    user.nombre = "Sara"
                    user.edad = "32"
                    liveDataViewModel.addUser(user)
                }
                2 -> {
                    val user = User()
                    user.nombre = "Maria"
                    user.edad = "27"
                    liveDataViewModel.addUser(user)
                }
            }

            liveDataViewModel.numero++
        }

        val listObserver = Observer<List<User>> { userList ->

            var texto = ""

            userList.forEach { user ->
                texto += user.nombre + " " + user.edad + "\n"
            }

            binding.tvLiveData.text = texto
        }

        liveDataViewModel.getUserList().observe(this@LiveDataActivity, listObserver)
    }
}