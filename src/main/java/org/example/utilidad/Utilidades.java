package org.example.utilidad;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidades {
    public Boolean buscarCoincidencia(String expresionRegular, String cadenaDeTexto) {
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(cadenaDeTexto);
        if (coincidencia.matches()) {
            return true;
        } else {
            return false;
        }
    }


    public LocalDate convertDate(String inputDate) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(inputDate, inputFormatter);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date.format(outputFormatter);
        return LocalDate.parse(formattedDate);
    }



}
