package org.example;

import org.example.modelos.Seguro;

public class Main {
    public static void main(String[] args) {

        Seguro seguro=new Seguro();
        seguro.setEdadAsegurado(23);
        System.out.println(seguro.calcularPrima());


    }
}