package com.meftaul.movies.controller;

import com.meftaul.movies.entity.Movie;
import com.meftaul.movies.service.MovieService;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public ResponseEntity<Movie> movies(@RequestBody Movie movie) {
        return ResponseEntity.status(HttpStatus.CREATED).body(movieService.save(movie));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getById(@PathVariable Long id) {
        return ResponseEntity.ok().body(movieService.findById(id));
    }

    @GetMapping
    public ResponseEntity<Page<Movie>> getAll(@ParameterObject Pageable pageable) {
        return ResponseEntity.ok().body(movieService.findAll(pageable));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> update(@PathVariable Long id, @RequestBody Movie movie) {
        return ResponseEntity.ok().body(movieService.update(id, movie));
    }

}

