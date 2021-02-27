package com.manugmoya.cursoavanzadoandroidkotlinmvvmcomorecomiendaandroid.bindingadapter

import android.view.View
import androidx.databinding.BindingAdapter

object BindingAdapter {

    @JvmStatic
    @BindingAdapter("visible")
    fun setVisibility(view: View, visibility: Boolean){
        if(visibility){
            view.visibility = View.VISIBLE
        }else{
            view.visibility = View.GONE
        }
    }
}