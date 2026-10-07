package ejercicio5.dto;

import ejercicio5.model.Categoria;
import ejercicio5.model.Creador;
import ejercicio5.model.Serie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public record SerieDTO(
        String titulo,
        Integer temporadas,
        String creador,
        String categoria,
        String imagenPrincipal
) {

    public static SerieDTO of(Serie serie) {

        if (serie == null) {
            return null;
        }

        return new SerieDTO(

                serie.getTitulo(),
                serie.getNumeroTemporadas(),
                nombreCompleto(serie.getCreador()),
                nombreCategoria(serie.getCategoria()),
                primeraImagen(serie.getImagenes())
        );
    }

    private static String nombreCompleto(Creador creador) {


        if (creador == null) {
            return null;
        }


        String completo = Stream.of(creador.getNombre(), creador.getApellidos())
                .filter(parte -> parte != null && !parte.isBlank())
                .map(String::trim)
                .collect(Collectors.joining(" "));

        return completo.isEmpty() ? null : completo;
    }

    private static String nombreCategoria(Categoria categoria) {

        if (categoria == null) {
            return null;
        }

        return categoria.getNombre();
    }

    private static String primeraImagen(List<String> imagenes) {

        if (imagenes == null) {
            return null;
        }

        return imagenes.stream()

                .filter(imagen -> imagen != null && !imagen.isBlank())
                .findFirst()
                .orElse(null);
    }

}
