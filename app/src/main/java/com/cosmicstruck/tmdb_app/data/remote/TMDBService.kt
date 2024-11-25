package com.cosmicstruck.tmdb_app.data.remote

import com.cosmicstruck.tmdb_app.common.API_KEY
import com.cosmicstruck.tmdb_app.data.remote.dto.movieDTO.MovieDTO
import retrofit2.http.GET

interface TMDBService {

    @GET("/movie/now_playing?api_key=${API_KEY}")
    suspend fun getNowPlayingMoviesList() : List<MovieDTO>

    @GET("/movie/popular?api_key=${API_KEY}")
    suspend fun getPopularMoviesList() : List<MovieDTO>

    @GET("/movie/top_rated?api_key=${API_KEY}")
    suspend fun getTopRatedMoviesList() : List<MovieDTO>

    @GET("/movie/upcoming?api_key=${API_KEY}")
    suspend fun getUpcomingMoviesList() : List<MovieDTO>
}