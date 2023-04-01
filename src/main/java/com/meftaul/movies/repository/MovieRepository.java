package com.meftaul.movies.repository;


import com.meftaul.movies.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findAllByDirector_Name(String name);
}
