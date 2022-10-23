package org.mvallesg.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class CalcularPrecioListaProductos {
    
    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto(3.5, 2));
        listaProductos.add(new Producto(4, 6));
        listaProductos.add(new Producto(7.2, 2));
        listaProductos.add(new Producto(1.5, 3));

        double granTotal = listaProductos.stream()
                .mapToDouble(producto -> producto.getPrecio()* producto.getCantidad())
                .sum();

        System.out.println("El gran total es: " + granTotal);
    }
}