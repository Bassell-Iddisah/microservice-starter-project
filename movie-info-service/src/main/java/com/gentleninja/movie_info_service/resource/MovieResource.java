package com.gentleninja.movie_info_service.resource;

import com.gentleninja.movie_info_service.modle.Movie;
import com.gentleninja.movie_info_service.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movies")
public class MovieResource {
    MovieService movieService;

    @GetMapping("/{id}")
    public String getMovieById(Long id) {
        Movie movie = movieService.getMovieById(id);
        return "";
    }
}
