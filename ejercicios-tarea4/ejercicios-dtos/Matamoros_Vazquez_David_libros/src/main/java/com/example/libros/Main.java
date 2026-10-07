package com.example.libros;

public class Main {

    public static void main(String[] args) {

        Autor autor1 = new Autor(1L, "Gabriel", "García", "Márquez", "Colombiana");
        Libro libro1 = new Libro(1L, "Cien años de soledad", "978-0-00-000001-1", 1967, 471, autor1);

        Autor autor2 = new Autor(2L, "Stephen", "King", null, "Estadounidense");
        Libro libro2 = new Libro(2L, "It", "978-0-00-000002-8", 1986, 1138, autor2);

        Libro libro3 = new Libro(3L, "Lazarillo de Tormes", "978-0-00-000003-5", 1554, 120, null);

        Autor autor4 = new Autor(4L, "Haruki", "Murakami", "", "Japonesa");
        Libro libro4 = new Libro(4L, "Tokio Blues", "978-0-00-000004-2", 1987, 400, autor4);

        Libro libro5 = new Libro(5L, "Libro raro", "978-0-00-000005-9", null, null, new Autor());

        System.out.println("1) Autor completo:         " + LibroDTO.from(libro1));
        System.out.println("2) Sin segundo apellido:   " + LibroDTO.from(libro2));
        System.out.println("3) Sin autor:              " + LibroDTO.from(libro3));
        System.out.println("4) Apellido2 vacío:        " + LibroDTO.from(libro4));
        System.out.println("5) Autor sin datos:        " + LibroDTO.from(libro5));

        System.out.println("6) Libro null:             " + LibroDTO.from(null));
    }
}
