package com.example.reservas;

public class Habitacion {

    private Long id;
    private String numero;
    private String tipo;
    private Double precioNoche;
    private Integer planta;

    public Habitacion() {
    }

    public Habitacion(Long id, String numero, String tipo, Double precioNoche, Integer planta) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
        this.planta = planta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(Double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public Integer getPlanta() {
        return planta;
    }

    public void setPlanta(Integer planta) {
        this.planta = planta;
    }
}
