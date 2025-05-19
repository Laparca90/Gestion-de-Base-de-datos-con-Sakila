/*
Cesar Maicol Leonardo Herrera
100614752
UASD 2025-10
*/
package com.sakila.models;

public class Film {
    private int film_id;
    private String title;
    private String description;
    private int release_year;

    // Constructor
    public Film(int film_id, String title, String description, int release_year) {
        this.film_id = film_id;
        this.title = title;
        this.description = description;
        this.release_year = release_year;
    }

    // Getters y setters
    public int getFilmId() { return film_id; }
    public void setFilmId(int film_id) { this.film_id = film_id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getReleaseYear() { return release_year; }
    public void setReleaseYear(int release_year) { this.release_year = release_year; }

    // Sobrescribir el método toString para exportar en formato CSV
    @Override
    public String toString() {
        return film_id + "," + title + "," + description + "," + release_year;
    }
}