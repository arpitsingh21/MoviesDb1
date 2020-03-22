package com.example.moviesdb.model

import java.io.Serializable

data class MoviesDataResponsePojo(val id:Int, val name:String, val  photo:String): Serializable{

    fun isSuccess():Boolean= (status==200)
}

