package com.example.moviesdb.data

import com.example.moviesdb.model.MovieDetailResposnePojo
import com.example.moviesdb.model.MoviesDataResponsePojo
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


object MoviesApiClient {


    private val API_BASE_URL = "https://api.themoviedb.org/"

    const val API_KEY = "52f41ad76e0ef3ea8060f5006b49c06f"

    private var moviesApiInterface:MoviesApiInterface?=null



    fun build():MoviesApiInterface?{
        var builder: Retrofit.Builder = Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())

        var httpClient: OkHttpClient.Builder = OkHttpClient.Builder()
        httpClient.addInterceptor(interceptor())

        var retrofit: Retrofit = builder.client(httpClient.build()).build()
        moviesApiInterface = retrofit.create(
            MoviesApiInterface::class.java)

        return moviesApiInterface as MoviesApiInterface
    }

    private fun interceptor(): HttpLoggingInterceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level=HttpLoggingInterceptor.Level.BODY
        return httpLoggingInterceptor
    }




    interface MoviesApiInterface {

        @GET("3/movie/popular")
        fun getMovies(@Query("api_key") api: String
                        ): Call<MoviesDataResponsePojo>

        @GET("3/movie/{movie_id}")
        fun getMovieDetail(@Path("movie_id") movieId: kotlin.Int, @Query("api_key") api: String
        ): Call<MovieDetailResposnePojo>

    }

}