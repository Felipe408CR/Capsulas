package org.example;

import clases.Estudiante;

public class Main {
    public static void main(String[] args) {

        Estudiante carlosypipe = new Estudiante();

        // ACCEDO A LOS METODOS DE ENCAPSULAMIENTO

        // MODIFICANDO "set" - LLEVA

        carlosypipe.setNombre("JUICIOSOS");

        carlosypipe.setNotaPromedio(15);

        // MOSTRANDO "get" - TRAER

        String nombre = carlosypipe.getNombre();
        System.out.println(nombre);
        double nota=carlosypipe.getNotaPromedio();
        System.out.println(nota);

    }
}