/*
Cesar Maicol Leonardo Herrera
100614752
UASD 2025-10
*/
package com.sakila.data;

import java.util.List;

public interface iDatapost<T> {
    void post(T obj);
    T get(int id);
    List<T> getAll();
    void put(T obj);
    void delete(int id);
}