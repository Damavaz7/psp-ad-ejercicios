package com.example.reservas;

public class Reserva {

    private Long id;
    private String codigo;
    private Integer numeroNoches;
    private Cliente cliente;
    private Habitacion habitacion;

    public Reserva() {
    }

    public Reserva(Long id, String codigo, Integer numeroNoches, Cliente cliente, Habitacion habitacion) {
        this.id = id;
        this.codigo = codigo;
        this.numeroNoches = numeroNoches;
        this.cliente = cliente;
        this.habitacion = habitacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getNumeroNoches() {
        return numeroNoches;
    }

    public void setNumeroNoches(Integer numeroNoches) {
        this.numeroNoches = numeroNoches;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
}
