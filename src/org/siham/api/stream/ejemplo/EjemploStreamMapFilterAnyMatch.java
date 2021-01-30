package org.siham.api.stream.ejemplo;

import org.siham.api.stream.ejemplo.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamMapFilterAnyMatch {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Pato XXX", "Paco XXXX", "Pepa XXX", "Pepe XXXX")
                .map(nombre -> {
                    return new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]);

                }).peek(System.out::println)
                ;
        boolean existe = nombres.anyMatch(u -> u.getId().equals(2));
        System.out.println(existe);

        List<Usuario> lista = Arrays.asList(new Usuario("Siham", "Sohayb"),
                new Usuario("Hector", "Gabucio"),
                new Usuario("Teresa", "Romero"),
                new Usuario("Dario", "Sarrio"));

        boolean resultado = false;

        for (Usuario u: lista){
            if(u.getId().equals(3)){
                resultado = true;
                break;
            }
        }
        System.out.println("Resultado con un bucle for tradicional " + resultado);
        Stream<Usuario> lista1 = lista.stream();
        boolean res = lista1.anyMatch(l -> l.getId().equals(3));

        System.out.println("Resultado con streams " + res);


    }
}
