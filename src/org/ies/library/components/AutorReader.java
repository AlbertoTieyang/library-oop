package org.ies.library.components;

import org.ies.library.model.Autor;

import java.util.Scanner;

public class AutorReader {
    private final Scanner scanner;

    public AutorReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Autor read (){
        System.out.println("Introduce el NIF");
        int NIF = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce el Nombre");
        String name = scanner.nextLine();

        System.out.println("Introduce los apellidos");
        String surName = scanner.nextLine();

        return new Autor(
                NIF,
                name,
                surName
        );
    }
}
