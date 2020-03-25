package com.example.moviesdb.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviesdb.R
import com.example.moviesdb.di.Injection
import com.example.moviesdb.model.Movies
import com.example.moviesdb.view.movieDetail.MovieDetailsActivity
import com.example.moviesdb.viewModel.MoviesViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_error.*

class MoviesActivity : AppCompatActivity() ,MoviesAdapter.OnItemClickListener{


    private lateinit var viewModel: MoviesViewModel
    private lateinit var adapter: MoviesAdapter

    private lateinit var itemclickListner : MoviesAdapter.OnItemClickListener

    companion object {
        const val TAG= "CONSOLE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViewModel()
        setupUI()
    }

    //ui
    private fun setupUI(){
        adapter= MoviesAdapter(viewModel.movies.value?: emptyList(),this)
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter= adapter
    }


    private fun setupViewModel(){
        viewModel = ViewModelProvider(this, Injection.provideViewModelFactory()).get(MoviesViewModel::class.java)
        viewModel.movies.observe(this,renderMovies)

        viewModel.isViewLoading.observe(this,isViewLoadingObserver)
        viewModel.onMessageError.observe(this,onMessageErrorObserver)
        viewModel.isEmptyList.observe(this,emptyListObserver)
    }

    //observers
    private val renderMovies= Observer<List<Movies>> {
        Log.v(TAG, "data updated $it")
        layoutError.visibility= View.GONE
        layoutEmpty.visibility= View.GONE
        adapter.update(it)
    }

    private val isViewLoadingObserver= Observer<Boolean> {
        Log.v(TAG, "isViewLoading $it")
        val visibility=if(it) View.VISIBLE else View.GONE
        progressBar.visibility= visibility
    }

    private val onMessageErrorObserver= Observer<Any> {
        Log.v(TAG, "onMessageError $it")
        layoutError.visibility= View.VISIBLE
        layoutEmpty.visibility= View.GONE
        textViewError.text= "Error $it"
    }

    private val emptyListObserver= Observer<Boolean> {
        Log.v(TAG, "emptyListObserver $it")
        layoutEmpty.visibility= View.VISIBLE
        layoutError.visibility= View.GONE
    }

    //If you require updated data, you can call the method "loadMovies" here
    override fun onResume() {
        super.onResume()
        viewModel.loadMovies()
    }

    override fun onMovieClick(c: Movies) {

        val i = Intent(this, MovieDetailsActivity::class.java)
        i.putExtra("movieId",c.getId())
        startActivity(i)

    }

}
