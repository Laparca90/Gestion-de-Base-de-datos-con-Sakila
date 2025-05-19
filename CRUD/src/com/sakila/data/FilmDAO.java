/*
Cesar Maicol Leonardo Herrera
100614752
UASD 2025-10
*/
package com.sakila.data;

import com.sakila.models.Film;
import java.util.ArrayList;
import java.util.List;

public class FilmDAO implements iDatapost<Film> {
    private List<Film> films = new ArrayList<>();

    @Override
    public void post(Film film) {
        films.add(film);
    }

    @Override
    public Film get(int id) {
        return films.stream().filter(f -> f.getFilmId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Film> getAll() {
        return new ArrayList<>(films);
    }

    @Override
    public void put(Film film) {
        delete(film.getFilmId());
        post(film);
    }

    @Override
    public void delete(int id) {
        films.removeIf(f -> f.getFilmId() == id);
    }
}