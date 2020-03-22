package com.example.moviesdb.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.moviesdb.R

class MoviesActivity : AppCompatActivity() {



    companion object {
        const val TAG= "CONSOLE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViewModel();
        setupUI();
    }

    //ui
    private fun setupUI(){

    }

    //view model
    private fun setupViewModel(){

    }
}
