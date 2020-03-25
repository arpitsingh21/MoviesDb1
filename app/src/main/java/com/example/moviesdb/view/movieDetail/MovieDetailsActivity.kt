package com.example.moviesdb.view.movieDetail

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.moviesdb.R
import com.example.moviesdb.Utils.StringUtils
import com.example.moviesdb.di.Injection
import com.example.moviesdb.model.MovieDetailResposnePojo
import com.example.moviesdb.view.MoviesActivity
import com.example.moviesdb.viewModel.MovieDetailViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_movi_details.*
import kotlinx.android.synthetic.main.layout_error.*

class MovieDetailsActivity : AppCompatActivity() {


    private lateinit var viewModel: MovieDetailViewModel

    private var movieId: kotlin.Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movi_details)

        movieId = intent.getIntExtra("movieId", 0)

        setupViewModel()

        setupView()

    }

    private fun setupView() {

        ivBack.setOnClickListener() {

            finish()
        }
    }


    private fun setupViewModel() {
        viewModel = ViewModelProvider(
            this,
            Injection.provideViewModeldetailFactory()
        ).get(MovieDetailViewModel::class.java)
        viewModel.movies.observe(this, renderMovies)

        viewModel.isViewLoading.observe(this, isViewLoadingObserver)
        viewModel.onMessageError.observe(this, onMessageErrorObserver)
    }


    //observers
    private val renderMovies = Observer<MovieDetailResposnePojo> {
        Log.v(MoviesActivity.TAG, "data updated $it")

        tvTitle.text = it.getTitle();
        Glide.with(ivPoster)
            .load("https://image.tmdb.org/t/p/w500" + it.getPosterPath()).into(ivPoster)
        tvDuration.text = it.getRuntime()?.let { it1 ->
            StringUtils.Companion.formatHoursAndMinutes(
                it1
            )
        }
        tvAbout.text = it.getOverview()
        tvReleaseDate.text = it.getReleaseDate()
        tvGener.text = it.getGenres().toString()
        tvLanguage.text = it.getOriginalLanguage()
        tvRating.text = it.getVoteAverage().toString()

//        tvAbout.text = it.getHomepage().

    }
    private val isViewLoadingObserver = Observer<Boolean> {

    }

    private val onMessageErrorObserver = Observer<Any> {
        Log.v(MoviesActivity.TAG, "onMessageError $it")
        layoutError.visibility = View.VISIBLE
        layoutEmpty.visibility = View.GONE
        textViewError.text = "Error $it"
    }


    override fun onResume() {
        super.onResume()
        viewModel.loadMovieDetail(movieId)
    }
}
