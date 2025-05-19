/*
Cesar Maicol Leonardo Herrera
100614752
UASD 2025-10
*/
package com.sakila.utils;

import java.util.regex.Pattern;

public class Validator {
    public static boolean validarTelefono(String input) {
        return Pattern.matches("\\+\\d{1,3}-\\d{7,10}", input);
    }

    public static boolean validarFecha(String input) {
        return Pattern.matches("\\d{4}-\\d{2}-\\d{2}", input);
    }
}