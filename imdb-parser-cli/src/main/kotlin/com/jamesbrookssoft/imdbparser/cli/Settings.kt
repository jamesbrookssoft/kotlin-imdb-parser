package com.jamesbrookssoft.imdbparser.cli

import com.beust.jcommander.Parameter

/**
 * Created by jamesbrookssoft on 12/06/16.
 */
data class Settings(
        @Parameter(names = arrayOf("-movie-id"), description = "The IMDB movie ID", required = true)
        var movieId: String = ""
) {
}