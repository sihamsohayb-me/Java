package org.siham.api.stream.ejemplo;

import org.siham.api.stream.ejemplo.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamMapFilterCount {
    public static void main(String[] args) {
        long existe = Stream.of("Pato XXX", "Paco XXXX", "Pepa XXX", "Pepe XXXX")
                .map(nombre -> {
                    return new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]);

                }).peek(System.out::println).count()
                ;

        System.out.println(existe);
    }
}
