
package ejercicio5;

import ejercicio5.dto.SerieDTO;
import ejercicio5.model.Categoria;
import ejercicio5.model.Creador;
import ejercicio5.model.Serie;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Objects;


public class Main {


    private static int fallos = 0;


    public static void main(String[] args) {

        Creador lucia = new Creador(1L, "Lucía", "Romero Vega", "España");

        Creador soloNombre = new Creador(2L, "Marcos", null, "México");

        Creador sinDatos = new Creador(3L, null, "   ", "Chile");

        Categoria drama = new Categoria(1L, "Drama", "Series de carácter dramático");

        List<String> imagenes = List.of("https://ejemplo.com/img/noches-1.jpg", "https://ejemplo.com/img/noches-2.jpg");


        Serie completa = new Serie(1L, "Noches de Sevilla", "Un thriller ambientado en la ciudad", 3, lucia, drama, imagenes);

        Serie sinCategoria = new Serie(2L, "El Faro", "Misterio en la costa", 2, lucia, null, imagenes);

        Serie sinImagenes = new Serie(3L, "Tierra Seca", "Drama rural", 1, lucia, drama, null);

        Serie imagenesVacias = new Serie(4L, "Mar Adentro", "Historia de supervivencia", 4, lucia, drama, new ArrayList<>());

        Serie sinCreador = new Serie(5L, "Anónimo", "Sin autoría conocida", 1, null, drama, imagenes);

        Serie creadorSoloNombre = new Serie(6L, "Ruta 66", "Viaje por carretera", 2, soloNombre, drama, imagenes);

        Serie creadorSinDatos = new Serie(7L, "Sin Firma", "Creador sin datos", 1, sinDatos, drama, imagenes);

        Serie primeraImagenHueco = new Serie(8L, "Huecos", "Lista con huecos", 1, lucia, drama,
                Arrays.asList(null, "", "https://ejemplo.com/img/huecos.jpg"));

        Serie sinTemporadas = new Serie(9L, "Sin Temporadas", "Dato no informado", null, lucia, drama, imagenes);


        SerieDTO dto1 = SerieDTO.of(completa);
        SerieDTO dto2 = SerieDTO.of(sinCategoria);
        SerieDTO dto3 = SerieDTO.of(sinImagenes);
        SerieDTO dto4 = SerieDTO.of(imagenesVacias);

        SerieDTO dto5 = SerieDTO.of(null);
        SerieDTO dto6 = SerieDTO.of(sinCreador);
        SerieDTO dto7 = SerieDTO.of(creadorSoloNombre);
        SerieDTO dto8 = SerieDTO.of(creadorSinDatos);
        SerieDTO dto9 = SerieDTO.of(primeraImagenHueco);
        SerieDTO dto10 = SerieDTO.of(sinTemporadas);


        System.out.println("=== DTO generados ===");

        System.out.println(dto1);
        System.out.println(dto2);
        System.out.println(dto3);
        System.out.println(dto4);
        System.out.println(dto5);
        System.out.println(dto6);
        System.out.println(dto7);
        System.out.println(dto8);
        System.out.println(dto9);
        System.out.println(dto10);


        System.out.println();
        System.out.println("=== Comprobaciones ===");

        comprobar("Serie completa: título", "Noches de Sevilla", dto1.titulo());
        comprobar("Serie completa: temporadas", 3, dto1.temporadas());
        comprobar("Serie completa: creador (nombre completo)", "Lucía Romero Vega", dto1.creador());
        comprobar("Serie completa: categoría (solo el nombre)", "Drama", dto1.categoria());
        comprobar("Serie completa: imagen principal (la primera)", "https://ejemplo.com/img/noches-1.jpg", dto1.imagenPrincipal());
        comprobar("Serie sin categoría", null, dto2.categoria());
        comprobar("Serie sin categoría: el resto de datos se mantiene", "Lucía Romero Vega", dto2.creador());
        comprobar("Serie sin imágenes (lista null)", null, dto3.imagenPrincipal());
        comprobar("Serie con lista de imágenes vacía", null, dto4.imagenPrincipal());
        comprobar("Serie null devuelve null", null, dto5);
        comprobar("Serie sin creador", null, dto6.creador());
        comprobar("Creador sin apellidos (sin 'null')", "Marcos", dto7.creador());
        comprobar("Creador sin datos", null, dto8.creador());
        comprobar("Primera imagen disponible (ignora huecos)", "https://ejemplo.com/img/huecos.jpg", dto9.imagenPrincipal());
        comprobar("Serie sin número de temporadas", null, dto10.temporadas());

        // Resumen final
        System.out.println();
        System.out.println("Comprobaciones fallidas: " + fallos);
    }

    private static void comprobar(String descripcion, Object esperado, Object obtenido) {

        boolean correcto = Objects.equals(esperado, obtenido);

        if (!correcto) {
            fallos++;
        }
        System.out.println((correcto ? "[OK]    " : "[FALLO] ") + descripcion + " -> " + obtenido);
    }

}
