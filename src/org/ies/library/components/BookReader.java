package org.ies.library.components;

import org.ies.library.model.Autor;
import org.ies.library.model.Book;

import java.util.Scanner;

public class BookReader {
    private final Scanner scanner;
    private final AutorReader autorReader;

    public BookReader(Scanner scanner, AutorReader autorReader) {
        this.scanner = scanner;
        this.autorReader = autorReader;
    }

    public Book read (){
        System.out.println("Introduce el ISBN");
        String ISBN = scanner.nextLine();

        System.out.println("Introduce el título");
        String title = scanner.nextLine();

        System.out.println("Introduce el año de publicación");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Cuántos autores quieres introducir?");
        int number = scanner.nextInt();
        while (number <=0){
            System.out.println("Número no válido");
            number = scanner.nextInt();
        }
        Autor[] autor = new Autor[number];
        for (int i = 0; i < autor.length; i++) {
            autor[i] = autorReader.read();
        }
        return new Book(
                ISBN,
                title,
                year,
                autor
        );
    }
}
