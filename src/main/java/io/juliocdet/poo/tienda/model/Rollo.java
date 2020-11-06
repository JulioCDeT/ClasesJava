package io.juliocdet.poo.tienda.model;

import io.juliocdet.poo.tienda.model.Producto;

public class Rollo implements Producto {

    private float precio;
    private String nombre;

    public Rollo(float precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Rollo{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
