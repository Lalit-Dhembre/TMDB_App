package com.cosmicstruck.tmdb_app.domain.repository

import com.cosmicstruck.tmdb_app.domain.model.movieListModel.Movies

interface Repository {

    suspend fun getNowPlayingMovies() : List<Movies>

    suspend fun getPopularMovies() : List<Movies>

    suspend fun getTopRatedMovies() : List<Movies>

    suspend fun getUpcomingMovies() : List<Movies>
}