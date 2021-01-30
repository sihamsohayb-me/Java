package org.siham.api.stream.ejemplo;

import org.siham.api.stream.ejemplo.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Pato XXX", "Paco XXXX", "Pepa XXX", "Pepe XXXX")
                .map(nombre -> {
                    return new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]);

                })
                .filter(u -> u.getName().equals("Pepe"));
        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(l -> System.out.println(l.toString()));
    }
}
