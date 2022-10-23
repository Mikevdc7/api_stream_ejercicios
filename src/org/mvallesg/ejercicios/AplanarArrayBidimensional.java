package org.mvallesg.ejercicios;

import java.util.Arrays;

public class AplanarArrayBidimensional {
    public static void main(String[] args) {

        String[][]lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"},
                {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        Arrays.asList(lenguajes).stream()
                .flatMap(subnivel -> Arrays.asList(subnivel).stream())
                .distinct()
                .forEach(lenguaje -> System.out.println(lenguaje));
    }
}