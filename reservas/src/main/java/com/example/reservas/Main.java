package com.example.reservas;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(1L, "Laura", "Gómez Ruiz", "laura@example.com", "600000001");
        Habitacion habitacion = new Habitacion(1L, "204", "Doble", 85.5, 2);

        Reserva completa = new Reserva(1L, "RES-001", 3, cliente, habitacion);

        Reserva sinCliente = new Reserva(2L, "RES-002", 2, null, habitacion);

        Reserva sinHabitacion = new Reserva(3L, "RES-003", 2, cliente, null);

        Reserva sinNoches = new Reserva(4L, "RES-004", null, cliente, habitacion);

        Habitacion habitacionSinPrecio = new Habitacion(2L, "305", "Suite", null, 3);
        Reserva sinPrecio = new Reserva(5L, "RES-005", 4, cliente, habitacionSinPrecio);

        System.out.println("1) Completa:        " + ReservaDTO.from(completa));
        System.out.println("2) Sin cliente:     " + ReservaDTO.from(sinCliente));
        System.out.println("3) Sin habitación:  " + ReservaDTO.from(sinHabitacion));
        System.out.println("4) Sin noches:      " + ReservaDTO.from(sinNoches));
        System.out.println("5) Sin precio:      " + ReservaDTO.from(sinPrecio));

        System.out.println("6) Reserva null:    " + ReservaDTO.from(null));
    }
}
