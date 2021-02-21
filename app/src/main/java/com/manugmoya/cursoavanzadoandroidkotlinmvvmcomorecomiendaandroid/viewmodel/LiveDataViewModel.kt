package com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.utils.User

class LiveDataViewModel : ViewModel() {

    var numero: Int = 0
    var userListLiveData: MutableLiveData<List<User>> = MutableLiveData()
    var userList: MutableList<User> = mutableListOf()

    fun getUserList(): LiveData<List<User>> {

        return userListLiveData
    }

    fun addUser(user: User) {

        userList.add(user)
        userListLiveData.value = userList
    }
}