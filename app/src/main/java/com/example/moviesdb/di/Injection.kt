package com.example.moviesdb.di

import androidx.lifecycle.ViewModelProvider
import com.example.moviesdb.model.MoviesDataRepository
import com.example.moviesdb.model.MoviesDataSource
import com.example.moviesdb.viewModel.ViewModeDetailFactory
import com.example.moviesdb.viewModel.ViewModelFactory


object Injection {

    private val moviesDataSource:MoviesDataSource = MoviesDataRepository()
    private val moviesViewModel = ViewModelFactory(moviesDataSource)

    private val moviesViewModelDetail = ViewModeDetailFactory(moviesDataSource)


    fun providerRepository():MoviesDataSource{
        return moviesDataSource
    }

    fun provideViewModeldetailFactory(): ViewModelProvider.Factory{
        return moviesViewModelDetail
    }

    fun provideViewModelFactory(): ViewModelProvider.Factory{
        return moviesViewModel
    }
}