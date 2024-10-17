package com.validaciones;

import com.excepciones.EmailFormatExcepcion;
import com.excepciones.StringTooLongException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {

    public static boolean validarFecha(String fechaStr, DateTimeFormatter formatter) {
        try {
            // Intentar parsear la cadena
            LocalDate fecha = LocalDate.parse(fechaStr, formatter);
            return true; // Fecha válida
        } catch (DateTimeParseException e) {
            System.out.println("Formato no válido. Formato correcto: dd/MM/yyyy " + e);

            return false; // Fecha no válida
        }
    }

    public static boolean validarDNI(String dni) {
        try {
            if (dni.length() == 8 || dni.length()==11) {
                //Intenta parsear la cadena
                Integer.parseInt(dni);
                return true;
            } else {
                throw new StringTooLongException("Not valid input");
            }
        }catch (NumberFormatException e){
            System.out.println("Invalid input. Input MUST be only numbers "+ e.getMessage());
            return false;
        }catch (StringTooLongException e) {
            System.out.println("ERR" + e.getMessage());
            return false;
        }
    }

    public static boolean validarEmail(String email){
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        try {
            Matcher matcher = pattern.matcher(email);
            if(!matcher.matches()){
                throw new EmailFormatExcepcion("Invalid email format");
            }
            return true;
        }catch (EmailFormatExcepcion e){
            System.out.println(e.getMessage());
            return false;
        }
    }









}
