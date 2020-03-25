package com.example.moviesdb.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moviesdb.data.MoviesCallback
import com.example.moviesdb.model.MovieDetailResposnePojo
import com.example.moviesdb.model.Movies
import com.example.moviesdb.model.MoviesDataResponsePojo
import com.example.moviesdb.model.MoviesDataSource

class MovieDetailViewModel (private val repository: MoviesDataSource): ViewModel() {

    private val _movies = MutableLiveData<MovieDetailResposnePojo>()
    val movies: LiveData<MovieDetailResposnePojo> = _movies


    private val _isViewLoading= MutableLiveData<Boolean>()
    val isViewLoading: LiveData<Boolean> = _isViewLoading

    private val _onMessageError= MutableLiveData<Any>()
    val onMessageError: LiveData<Any> = _onMessageError

//    private val _isEmptyList= MutableLiveData<Boolean>()
//    val isEmptyList: LiveData<Boolean> = _isEmptyList



    fun loadMovieDetail( movieId : kotlin.Int){
        _isViewLoading.postValue(true)

        repository.getMovieDetail(movieId ,"52f41ad76e0ef3ea8060f5006b49c06f",object:
            MoviesCallback<MovieDetailResposnePojo> {


            override fun onSuccess(data: MovieDetailResposnePojo?) {

                _isViewLoading.postValue(false)

                if(data!=null){
                    if(data.getId()==null){
                        _onMessageError.postValue( "Unable to Fetch")
                    }else{
                        _movies.value= data
                    }
                }
            }

            override fun onError(error: String?) {
                _isViewLoading.postValue(false)
                _onMessageError.postValue( error)
            }
        })
    }
}