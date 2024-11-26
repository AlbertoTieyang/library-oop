package org.ies.library.components;

import org.ies.library.model.Biblioteca;
import org.ies.library.model.Book;

import java.util.Scanner;

public class LibraryReader {
    private final Scanner scanner;
    private final BookReader bookReader;

    public LibraryReader(Scanner scanner, BookReader bookReader) {
        this.scanner = scanner;
        this.bookReader = bookReader;
    }

    public Biblioteca read(){
        System.out.println("Introduce el nombre de la bilioteca");
        String name = scanner.nextLine();

        System.out.println("Introduce cuántos libros vas a introducir");
        int number = scanner.nextInt();
        scanner.nextLine();

        while(number <= 0){
            System.out.println("Numero no válido, introduce otro");
            number = scanner.nextInt();
        }
        Book[] book = new Book[number];
        for (int i = 0; i < book.length; i++) {
            book[i] = bookReader.read();
        }
        return new Biblioteca(
                book,
                name
        );
    }
}
