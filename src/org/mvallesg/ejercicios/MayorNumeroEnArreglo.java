package org.mvallesg.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MayorNumeroEnArreglo {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=1; i<=100; i++){
            lista.add(i);
        }

        Function<List<Integer>, Integer> funcionNumMayor = n -> lista.stream()
                .reduce(0, (a, b) -> (b>a)?b:a);
        System.out.println(funcionNumMayor.apply(lista));
    }
}