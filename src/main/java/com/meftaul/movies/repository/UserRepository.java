package com.meftaul.movies.repository;


import com.meftaul.movies.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
