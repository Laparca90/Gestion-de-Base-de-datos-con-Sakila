/*
Cesar Maicol Leonardo Herrera
100614752
UASD 2025-10
*/
package com.sakila.utils;

import com.sakila.controllers.FilmController;
import com.sakila.controllers.JSONExporter;
import com.sakila.models.Film;
import com.sakila.reports.CsvExporter;

import java.io.File;
import java.util.List;

public class SakilaConsoleApp {
    public static void main(String[] args) {
        try {
            FilmController controller = new FilmController();

            System.out.println("🎬 Lista de películas:");
            controller.listarPeliculas();

            System.out.println("\n➕ Agregando una película:");
            Film nueva = new Film(0, "Mi Película Java", "Hecha con JDBC", 2025);
            controller.agregar(nueva);

            System.out.println("\n✏️ Actualizando la película (usa un ID real):");
            Film actualizada = new Film(1, "Película Actualizada", "Descripción nueva", 2024);
            controller.actualizar(actualizada);

            System.out.println("\n❌ Eliminando película (ID 1):");
            controller.eliminar(1);

            List<Film> peliculas = controller.obtenerTodas();

            File carpeta = new File("exportaciones");
            if (!carpeta.exists()) {
                carpeta.mkdirs();
            }

            CsvExporter.export("exportaciones/peliculas.csv", peliculas);
            System.out.println("✅ Exportación a CSV completada: exportaciones/peliculas.csv");

            JSONExporter jsonExporter = new JSONExporter();
            jsonExporter.exportToJSON(peliculas, "exportaciones/peliculas.json");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}