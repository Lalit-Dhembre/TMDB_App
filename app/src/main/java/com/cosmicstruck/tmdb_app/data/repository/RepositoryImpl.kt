package com.cosmicstruck.tmdb_app.data.repository

import com.cosmicstruck.tmdb_app.data.remote.TMDBService
import com.cosmicstruck.tmdb_app.data.remote.dto.movieDTO.toNowPlaying
import com.cosmicstruck.tmdb_app.domain.model.movieListModel.Movies
import com.cosmicstruck.tmdb_app.domain.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val apiService: TMDBService
): Repository {
    override suspend fun getNowPlayingMovies(): List<Movies> {
        return apiService.getNowPlayingMoviesList().map { it.toNowPlaying() }
    }

    override suspend fun getPopularMovies(): List<Movies> {
        return apiService.getPopularMoviesList().map{it.toNowPlaying()}
    }

    override suspend fun getTopRatedMovies(): List<Movies> {
        return apiService.getTopRatedMoviesList().map { it.toNowPlaying() }
    }

    override suspend fun getUpcomingMovies(): List<Movies> {
        return apiService.getUpcomingMoviesList().map { it.toNowPlaying() }
    }
}