package com.javaunit3.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class BestMovieService {

    //@Autowired //injection
    private Movie movie;

    // setter method
//    @Autowired
//    public void setMovie(Movie movie) {
//        this.movie = movie;
//    }

    //constructor method
//    @Autowired
//    public BestMovieService(Movie movie) {
//        this.movie = movie;
//    }

    @Autowired
    public BestMovieService(@Qualifier("titanicMovie") Movie movie) {
        this.movie = movie;
    }

    public Movie getBestMovie() {
        return movie;
    }
}
