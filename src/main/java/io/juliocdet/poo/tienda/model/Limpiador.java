package io.juliocdet.poo.tienda.model;

public class Limpiador implements Producto{

    private float precio;
    private String nombre;

    public Limpiador(float precio, String nombre) {
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
        return "Limpiador{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
