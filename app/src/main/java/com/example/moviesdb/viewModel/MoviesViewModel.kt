package com.example.moviesdb.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moviesdb.data.MoviesCallback
import com.example.moviesdb.model.Movies
import com.example.moviesdb.model.MoviesDataResponsePojo
import com.example.moviesdb.model.MoviesDataSource

class MoviesViewModel(private val repository: MoviesDataSource): ViewModel() {

    private val _movies = MutableLiveData<List<Movies>>().apply { value = emptyList() }
    val movies: LiveData<List<Movies>> = _movies


    private val _isViewLoading= MutableLiveData<Boolean>()
    val isViewLoading: LiveData<Boolean> = _isViewLoading

    private val _onMessageError= MutableLiveData<Any>()
    val onMessageError: LiveData<Any> = _onMessageError

    private val _isEmptyList= MutableLiveData<Boolean>()
    val isEmptyList: LiveData<Boolean> = _isEmptyList



    fun loadMovies(){
        _isViewLoading.postValue(true)

        repository.getMovies("52f41ad76e0ef3ea8060f5006b49c06f",object:MoviesCallback<MoviesDataResponsePojo>{


            override fun onSuccess(data: MoviesDataResponsePojo?) {

                _isViewLoading.postValue(false)

                if(data!=null){
                    if(data.getPage()==null){
                        _isEmptyList.postValue(true)
                    }else{
                        _movies.value= data.getResults()
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
