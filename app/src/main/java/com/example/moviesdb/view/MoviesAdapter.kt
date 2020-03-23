package com.example.moviesdb.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moviesdb.R
import com.example.moviesdb.model.Movies

class MoviesAdapter(private var movies:List<Movies>):RecyclerView.Adapter<MoviesAdapter.MViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_movies, parent, false)
        return MViewHolder(view)
    }

    override fun onBindViewHolder(vh: MViewHolder, position: Int) {
        val movies = movies[position]

    vh.textViewName.text= movies.getTitle()
    Glide.with(vh.imageView.context).load("https://image.tmdb.org/t/p/w500"+movies.getPosterPath()).into(vh.imageView)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    fun update(data: List<Movies>) {
        movies = data
        notifyDataSetChanged()
    }

    class MViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewName: TextView = view.findViewById(R.id.textViewName)
        val imageView: ImageView = view.findViewById(R.id.imageView)
        val textViewLink: TextView = view.findViewById(R.id.textViewLink)
    }

}