package com.gentleninja.ratings_data_service.resource;

import com.gentleninja.ratings_data_service.model.Ratings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class MovieResource {

    @RequestMapping("/{movieId}")
    public Ratings getMovieRatingById(@PathVariable("movieId") String movieId) {
        return new Ratings(movieId, 6);
    }
}
