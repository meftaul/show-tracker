package com.meftaul.movies.repository;


import com.meftaul.movies.entity.Genre;
import com.meftaul.movies.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Long> {
}
