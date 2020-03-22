package com.example.moviesdb.model

import android.util.Log
import com.example.moviesdb.data.MoviesApiClient
import com.example.moviesdb.data.MoviesCallback
import com.example.moviesdb.view.MoviesActivity.Companion.TAG
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MoviesDataRepository :MoviesDataSource{

    private var call: Call<MoviesDataResponsePojo>?=null

    override fun getMovies(page: String,callback: MoviesCallback<MoviesDataResponsePojo>) {

        call=MoviesApiClient.build()?.getMovies(page)
        call?.enqueue(object : Callback<MoviesDataResponsePojo> {
            override fun onFailure(call: Call<MoviesDataResponsePojo>, t: Throwable) {
                callback.onError(t.message)
            }

            override fun onResponse(call: Call<MoviesDataResponsePojo>, response: Response<MoviesDataResponsePojo>) {
                response?.body()?.let {
                    if(response.isSuccessful && (it.isSuccess())){
                        Log.v(TAG, "data ${it.data}")
                        callback.onSuccess(it.data)
                    }else{
                        callback.onError(it.msg)
                    }
                }
            }
        })    }

}