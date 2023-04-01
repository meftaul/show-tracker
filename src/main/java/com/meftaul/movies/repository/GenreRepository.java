package com.meftaul.movies.repository;


import com.meftaul.movies.entity.Actor;
import com.meftaul.movies.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
