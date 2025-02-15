package com.jamesbrookssoft.imdbparser.model

import java.time.LocalDate

/**
 * Created by jamesbrookssoft on 11/06/16.
 */
//@formatter:off
data class Movie(
        val id: String,
        val name: String,
        val releaseDate: LocalDate,
        var plot: Plot = Plot("No summary"),
        var relatedMovies : List<MovieRef>
) {
//@formatter:on
    val movieRef: MovieRef = MovieRef(id, name)
}