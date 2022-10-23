package org.mvallesg.ejercicios;

import java.util.ArrayList;

public class ModificarFlujoDevolverSuma {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=1; i<=100; i++){
            lista.add(i);
        }

        double sumaTotal = lista.stream()
                .filter(n -> n%10!=0)
                .mapToDouble(n -> n.doubleValue())
                .map(n -> n/2)
                .reduce(0, (a, b) -> a+b);
        System.out.println("La suma total es: " + sumaTotal);
    }
}