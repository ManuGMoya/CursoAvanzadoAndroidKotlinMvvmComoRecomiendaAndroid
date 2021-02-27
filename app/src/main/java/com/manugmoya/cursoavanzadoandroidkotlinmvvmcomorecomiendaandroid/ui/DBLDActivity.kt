package com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.R
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.databinding.ActivityDbldBinding
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.utils.User
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.viewmodel.DBLDViewModel

class DBLDActivity : AppCompatActivity() {

    lateinit var viewModel: DBLDViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityDbldBinding =
            DataBindingUtil.setContentView(this@DBLDActivity, R.layout.activity_dbld)

        binding.lifecycleOwner = this

        viewModel = ViewModelProvider(this).get(DBLDViewModel::class.java)

        binding.viewModel = viewModel

        val user = User("Manuel", "41")

        viewModel.setUser(user)
    }
}