package com.meftaul.movies.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICurdService<T, ID> {
    public T save(T object);
    public T findById(ID id);
    public T update(ID id, T object);
    public void deleteById(ID id);
    public Page<T> findAll(Pageable pageable);
}
