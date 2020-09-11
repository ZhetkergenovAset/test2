package com.example.test2.service;


import java.util.Optional;

public interface BaseService<T> {
    T save(T t);
    T update(T t);
    Optional<T> getById(T t);
    void delete(T t);
}
