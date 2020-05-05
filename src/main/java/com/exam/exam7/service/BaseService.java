package com.exam.exam7.service;

import java.util.List;

public interface BaseService<T> {
    List<T> getAll();

    T save(T item);

    void deleteById(Long id);

    T getById(Long id);
}
