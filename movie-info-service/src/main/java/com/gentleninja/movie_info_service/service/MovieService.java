package com.gentleninja.movie_info_service.service;


import com.gentleninja.movie_info_service.modle.Movie;

public interface MovieService {
    Movie getMovieById(Long id);
}
