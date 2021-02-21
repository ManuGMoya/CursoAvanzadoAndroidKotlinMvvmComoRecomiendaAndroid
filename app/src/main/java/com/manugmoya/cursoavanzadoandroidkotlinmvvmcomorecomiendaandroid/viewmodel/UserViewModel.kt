package com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.viewmodel

import androidx.lifecycle.ViewModel
import com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.utils.User

class UserViewModel : ViewModel{

    var userList: MutableList<User>

    constructor(){
        userList = mutableListOf()
    }

    fun addUser(user: User){
        userList.add(user)
    }

}