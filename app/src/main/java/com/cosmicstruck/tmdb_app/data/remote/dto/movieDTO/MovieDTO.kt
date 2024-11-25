package com.cosmicstruck.tmdb_app.data.remote.dto.movieDTO

import com.cosmicstruck.tmdb_app.domain.model.movieListModel.Movies

data class MovieDTO(
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: List<Int>,
    val id: Int,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int
)

fun MovieDTO.toNowPlaying(): Movies {
    return Movies(
        title = title,
        overview = overview,
        review = vote_average,
        backDrop = backdrop_path,
        poster = poster_path
    )
}