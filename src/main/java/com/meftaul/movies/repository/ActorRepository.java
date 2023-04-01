package com.meftaul.movies.repository;


import com.meftaul.movies.entity.Actor;
import com.meftaul.movies.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {
}
