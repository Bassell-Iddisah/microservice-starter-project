package com.gentleninja.movie_info_service.resource;

import com.gentleninja.movie_info_service.modle.Movie;
import com.gentleninja.movie_info_service.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movies")
public class MovieResource {
    MovieService movieService;

    MovieResource(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/{movieId}")
    public Movie getMovieById(@PathVariable("movieId") String movieId) {
        return movieService.getMovieById(movieId);
    }
}
