package com.meftaul.movies.service;

import com.meftaul.movies.entity.Movie;
import com.meftaul.movies.repository.MovieRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements ICurdService<Movie, Long>{

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie findById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public Movie update(Long id, Movie movie) {

        if (id.equals(movie.getId()) && movieRepository.existsById(id)) {
            return movieRepository.save(movie);
        } else {
            throw new RuntimeException("Movie id does not match");
        }
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Page<Movie> findAll(Pageable pageable) {
        return movieRepository.findAll(pageable);
    }

}
