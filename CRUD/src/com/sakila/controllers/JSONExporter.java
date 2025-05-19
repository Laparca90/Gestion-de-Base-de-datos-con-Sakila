/*
Cesar Maicol Leonardo Herrera
100614752
UASD 2025-10
*/
package com.sakila.controllers;

import com.google.gson.Gson;
import com.sakila.models.Film;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JSONExporter {
    public void exportToJSON(List<Film> films, String filePath) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(films, writer);
            System.out.println("✅ Exportación a JSON completada: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

