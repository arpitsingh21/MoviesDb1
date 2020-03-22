package com.example.moviesdb.data

interface MoviesCallback <T> {
    fun onSuccess(data:List<T>?)
    fun onError(error:String?)
}