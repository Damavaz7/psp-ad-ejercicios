package com.example.reservas;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public record ReservaDTO(String codigo, String cliente, String habitacion,
                         Integer numeroNoches, Double precioTotal) {

    public static ReservaDTO from(Reserva reserva) {

        if (reserva == null) {
            return null;
        }

        String textoCliente = null;
        Cliente clienteReserva = reserva.getCliente();
        if (clienteReserva != null) {

            textoCliente = unirPartes(" ", clienteReserva.getNombre(), clienteReserva.getApellidos());
        }

        String textoHabitacion = null;
        Double precioNoche = null;
        Habitacion habitacionReserva = reserva.getHabitacion();
        if (habitacionReserva != null) {

            textoHabitacion = unirPartes(" - ", habitacionReserva.getNumero(), habitacionReserva.getTipo());
            precioNoche = habitacionReserva.getPrecioNoche();
        }

        // ---------- PRECIO TOTAL ----------
        Integer noches = reserva.getNumeroNoches();
        Double precioTotal = null; 

        if (noches != null && precioNoche != null) {

            precioTotal = Math.round(noches * precioNoche * 100.0) / 100.0;
        }

        return new ReservaDTO(reserva.getCodigo(), textoCliente, textoHabitacion, noches, precioTotal);
    }

    private static String unirPartes(String separador, String... partes) {

        String resultado = Stream.of(partes)
                .filter(parte -> parte != null && !parte.isBlank())
                .map(String::trim)
                .collect(Collectors.joining(separador));

        if (resultado.isEmpty()) {
            return null;
        }
        return resultado;
    }
}
