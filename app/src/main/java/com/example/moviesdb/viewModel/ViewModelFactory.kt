package com.example.moviesdb.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.moviesdb.model.MoviesDataSource

class ViewModelFactory(private val repository:MoviesDataSource):ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MoviesViewModel(repository) as T
    }
}