package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.Movies;

import com.capg.exception.MovieNotFoundException;

import com.capg.repository.MoviesRepository;

@Service
public class MoviesServiceImpl implements MoviesService {

    @Autowired
    private MoviesRepository moviesRepository;
    
    @Override
    public List<Movies> getAllMovies() {
        return moviesRepository.findAll();
    }

    @Override
    public Movies getMovieById(long id) throws MovieNotFoundException{
        Movies movie;
        if(moviesRepository.findById(id).isEmpty()) {
            throw new MovieNotFoundException();
        }
        else {
            movie=moviesRepository.findById(id).get();
        }
        return movie;
        }

    @Override
    public Movies addMovie(Movies movie) {
        return moviesRepository.save(movie);
    }

    @Override
    public void updateMovie(Movies movie) {
        moviesRepository.save(movie);
    }

    @Override
    public void deleteMovie(long id) {
        moviesRepository.deleteById(id);
    }
}