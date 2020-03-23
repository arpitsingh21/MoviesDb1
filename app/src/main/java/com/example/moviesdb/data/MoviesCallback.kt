package com.example.moviesdb.data

interface MoviesCallback <T> {
    fun onSuccess(data:T?)
    fun onError(error:String?)
}