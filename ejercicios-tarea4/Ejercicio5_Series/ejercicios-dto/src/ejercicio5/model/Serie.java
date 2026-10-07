
package ejercicio5.model;


import java.util.List;

public class Serie {

    private Long id;

    private String titulo;

    private String sinopsis;

    private Integer numeroTemporadas;

    private Creador creador;

    private Categoria categoria;

    private List<String> imagenes;

    public Serie() {
    }


    public Serie(Long id, String titulo, String sinopsis, Integer numeroTemporadas,
                 Creador creador, Categoria categoria, List<String> imagenes) {

        this.id = id;
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.numeroTemporadas = numeroTemporadas;

        this.creador = creador;

        this.categoria = categoria;

        this.imagenes = imagenes;
    }


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }


    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }


    public String getSinopsis() { return sinopsis; }

    public void setSinopsis(String sinopsis) { this.sinopsis = sinopsis; }


    public Integer getNumeroTemporadas() { return numeroTemporadas; }

    public void setNumeroTemporadas(Integer numeroTemporadas) { this.numeroTemporadas = numeroTemporadas; }


    public Creador getCreador() { return creador; }

    public void setCreador(Creador creador) { this.creador = creador; }

    public Categoria getCategoria() { return categoria; }

    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public List<String> getImagenes() { return imagenes; }

    public void setImagenes(List<String> imagenes) { this.imagenes = imagenes; }

}
