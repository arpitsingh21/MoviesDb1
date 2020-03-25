package com.example.moviesdb.model

import com.example.moviesdb.data.MoviesCallback

interface MoviesDataSource {


    fun getMovies(apikey:String,callback: MoviesCallback<MoviesDataResponsePojo>)

    fun getMovieDetail(movieId : kotlin.Int,apikey:String,callback: MoviesCallback<MovieDetailResposnePojo>)

}