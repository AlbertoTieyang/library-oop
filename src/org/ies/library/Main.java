package org.ies.library;

import org.ies.library.components.AutorReader;
import org.ies.library.components.BookReader;
import org.ies.library.components.LibraryReader;
import org.ies.library.model.Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AutorReader autorReader = new AutorReader(scanner);
        BookReader bookReader = new BookReader(scanner, autorReader);
        LibraryReader libraryReader = new LibraryReader(scanner, bookReader);

        Biblioteca library = libraryReader.read();

        System.out.println(library);
    }
}