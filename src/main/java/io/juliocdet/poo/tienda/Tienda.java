package io.juliocdet.poo.tienda;

import io.juliocdet.poo.tienda.model.Comprador;
import io.juliocdet.poo.tienda.model.Limpiador;
import io.juliocdet.poo.tienda.model.Papa;
import io.juliocdet.poo.tienda.model.Producto;
import io.juliocdet.poo.tienda.model.Rollo;

import java.util.Scanner;

public class Tienda {

    public static void simularTienda() {
        Cliente miguel = new Cliente("Miguel", 2000.0F);

        // Mostrar como actualmente la lista de productos de miguel esta vacia
        System.out.println(miguel.getListaProductos());

        // Creamos productos de la tienda
        Producto papaCambray = new Papa(20.0F, 120.0F, "papa cambray");
        Producto suavimax = new Rollo(3.0F, "suavimax");
        Producto maestroLimpio = new Limpiador(25.0F, "maestro limpio");

        // Agregamos productos al la lista del cliente miguel
        System.out.println("Lista de miguel");
        miguel.agregarAlCarrito(papaCambray);
        miguel.agregarAlCarrito(suavimax);
        System.out.println(miguel.getListaProductos());

        miguel.agregarAlCarrito(maestroLimpio);
        System.out.println(miguel.getListaProductos());
        System.out.println("La lista de miguel tiene "
                + miguel.getCantidadProductosAComprar() + " productos");

        // Creamos otro comprador / CLiente
        System.out.println("Lista de tulio");
        Comprador tulio = new Comprador("Tulio", 3000.0F, "Vales");
        tulio.agregarAlCarrito(papaCambray);
        System.out.println(tulio.getListaProductos());
        System.out.println("La lista de tulio tiene "
                + tulio.getCantidadProductosAComprar() + " productos");
        //Producto papaFrancas = new Papa(34.0F, 200.0F, "papa francesa");
        tulio.agregarAlCarrito(new Papa(34.0F, 200.0F, "papa francesa"));
        System.out.println(tulio.getListaProductos());
        System.out.println("La lista de tulio tiene "
                + tulio.getCantidadProductosAComprar() + " productos");

        // mostrar precios de la lista de tulio
        System.out.println("mostrar precios de la lista de tulio");
        for (Producto producto : tulio.getListaProductos()) {
            System.out.println("El precio del producto es: " + producto.getPrecio());
        }

        // mostrar precios de la lista de miguel
        System.out.println("mostrar precios de la lista de miguel");
        for (int i = 0; i < miguel.getCantidadProductosAComprar(); i++) {
            System.out.println("El precio del producto es: " +
                    miguel.getListaProductos().get(i).getPrecio());
        }

        tulio.limpiarLista();

        Scanner sc = new Scanner(System.in);
        System.out.print("cantidas de productoa agregar: ");
        int productosAAgregar = sc.nextInt();
        for (int i = 0; i < productosAAgregar; i++) {
            System.out.println("ingresa valor nutrimental del producto: ");
            float nutrientes = sc.nextFloat();
            Producto producto = new Papa(14F, nutrientes,"Papa generica");
            tulio.agregarAlCarrito(producto);
            System.out.println("Acabas de agregar: " + producto);
        }
        System.out.println(tulio.getListaProductos());
    }
}
