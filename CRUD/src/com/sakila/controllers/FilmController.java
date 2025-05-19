/*
Cesar Maicol Leonardo Herrera
100614752
UASD 2025-10
*/
package com.sakila.controllers;

import com.sakila.data.FilmDAO;
import com.sakila.data.iDatapost;
import com.sakila.models.Film;

import java.util.List;

public class FilmController {

    private final iDatapost<Film> filmDAO;

    public FilmController() {
        this.filmDAO = new FilmDAO();
    }

    public void listarPeliculas() throws Exception {
        List<Film> peliculas = filmDAO.getAll();
        for (Film f : peliculas) {
            System.out.println(f);
        }
    }

    public void agregar(Film film) throws Exception {
        filmDAO.post(film);
        System.out.println("✅ Película agregada correctamente.");
    }

    public void actualizar(Film film) throws Exception {
        filmDAO.put(film);
        System.out.println("✅ Película actualizada correctamente.");
    }

    public void eliminar(int id) throws Exception {
        filmDAO.delete(id);
        System.out.println("✅ Película eliminada correctamente.");
    }

    public List<Film> obtenerTodas() throws Exception {
        return filmDAO.getAll();
    }
}