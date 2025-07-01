package com.gentleninja.movie_info_service.service.impl;

import com.gentleninja.movie_info_service.modle.Movie;
import com.gentleninja.movie_info_service.service.MovieService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    public Movie getMovieById(String id) {
        return new Movie(id, "Test Movie");
    }
}
