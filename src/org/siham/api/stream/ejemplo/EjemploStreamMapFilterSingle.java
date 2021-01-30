package org.siham.api.stream.ejemplo;

import org.siham.api.stream.ejemplo.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMapFilterSingle {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Pato XXX", "Paco XXXX", "Pepa XXX", "Pepe XXXX")
                .map(nombre -> {
                    return new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]);

                }).peek(System.out::println)
                .filter(u -> u.getId().equals(1));
        Optional<Usuario> usuario = nombres.findFirst();
        System.out.println(usuario.toString());
        //Optional
        Stream<Usuario> nombres1 = Stream.of("Pato XXX", "Paco XXXX", "Pepa XXX", "Pepe XXXX")
                .map(nombre -> {
                    return new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]);

                }).peek(System.out::println)
                .filter(u -> u.getName().equals("pepeX"));
        Optional<Usuario> usuario1 = nombres.findFirst();
        System.out.println(usuario1.toString());
    }
}
