/*
Cesar Maicol Leonardo Herrera
100614752
UASD 2025-10
*/
package com.sakila.data;

import java.sql.*;
import java.util.List;

public abstract class DataContext<T> implements iDatapost<T> {

    protected final Connection conn;

    public DataContext() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "picapapa3");
    }

    public final void post(T obj) {
        System.out.println("Método post concreto en padre.");
    }

    public void testConnection() throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM film LIMIT 5");

        while (rs.next()) {
            System.out.println("Film Title: " + rs.getString("title"));
        }
    }

    public final void put(T obj) {
        System.out.println("Método put concreto en padre.");
    }

    public final void delete(int id) {
        System.out.println("Método delete concreto en padre.");
    }

    public abstract T get(int id);

    public abstract List<T> getAll();
}