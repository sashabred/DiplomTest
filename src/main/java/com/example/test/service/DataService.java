package com.example.test.service;

import java.io.Serializable;
import java.util.List;

public interface DataService<T, ID extends Serializable> {
    T save(T t);
    List<T> getAll();
}
