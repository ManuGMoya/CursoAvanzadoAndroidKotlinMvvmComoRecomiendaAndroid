package com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.utils.User

class DBLDViewModel : ViewModel() {

    val user: MutableLiveData<User> = MutableLiveData()
    var visible: MutableLiveData<Boolean> = MutableLiveData()

    fun setUser(user: User) {
        this.user.value = user
    }

    fun updateUser() {
        val user = User("Laura", "23")
        this.user.value = user
    }

    fun setVisibility(visible: Boolean) {
        this.visible.value = visible
    }

    fun changeVisibility() {
        if (visible.value == true) {
            visible.value = false
        } else {
            visible.value = true
        }
    }
}