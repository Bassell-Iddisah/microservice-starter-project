package com.gentleninja.ratings_data_service.model;

public class Ratings {
    private String movieId;
    private int rating;

    public Ratings(String movieId, int rating) {
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
