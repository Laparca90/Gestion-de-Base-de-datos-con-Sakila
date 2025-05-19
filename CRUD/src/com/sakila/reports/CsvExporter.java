/*
Cesar Maicol Leonardo Herrera
100614752
UASD 2025-10
*/
package com.sakila.reports;

import java.io.FileWriter;
import java.util.List;

public class CsvExporter {
    public static <T> void export(String fileName, List<T> list) throws Exception {
        FileWriter writer = new FileWriter(fileName);
        for (T obj : list) {
            writer.write(obj.toString() + "\n");
        }
        writer.close();
    }

}