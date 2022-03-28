package com.example.moviesbookingrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.layout_movie_list_item.view.*

import models.MoviesCatalog
import kotlin.collections.ArrayList

class MovieRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    private var items: List<MoviesCatalog> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_movie_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is MovieViewHolder -> {
                holder.bind(items[position])
            }

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }



    fun submitList(movieList: List<MoviesCatalog>) {
        items = movieList
    }

    class MovieViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val movie_image = itemView.movie_image
        val movie_title = itemView.movie_title
        val movie_description = itemView.movie_description
        val movie_time = itemView.movie_time

        fun bind(moviesCatalog: MoviesCatalog){

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(moviesCatalog.image)
                .into(movie_image)
            movie_title.setText(moviesCatalog.title)
            movie_description.setText(moviesCatalog.description)
            movie_time.setText(moviesCatalog.time)
        }

    }

}
