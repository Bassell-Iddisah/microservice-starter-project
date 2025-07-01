package com.gentleninja.movie_catalog_service.models;

public class ratings {
    private String movieId;
    private int rating;

    public ratings(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}
