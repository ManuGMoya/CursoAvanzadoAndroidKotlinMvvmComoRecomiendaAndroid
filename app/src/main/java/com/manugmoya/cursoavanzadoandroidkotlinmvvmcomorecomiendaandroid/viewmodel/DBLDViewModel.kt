package com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.utils.User

class DBLDViewModel : ViewModel() {

    val user: MutableLiveData<User> = MutableLiveData()

    fun setUser(user: User) {
        this.user.value = user
    }

    fun updateUser(){
        val user = User("Laura", "23")
        this.user.value = user
    }

    fun changeVisibility(){

    }
}