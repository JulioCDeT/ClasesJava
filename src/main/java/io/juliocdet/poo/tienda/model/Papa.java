package io.juliocdet.poo.tienda.model;

public class Papa implements Producto, Comida {

    /* Variables de instancia */
    private float precio;
    private float nutriente;
    private String nombre;

    public Papa(float precio, float nutriente, String nombre) {
        this.precio = precio;
        this.nutriente = nutriente;
        this.nombre = nombre;
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    @Override
    public float getNutrientes() {
        return nutriente;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Papa{" +
                "precio=" + precio +
                ", nutriente=" + nutriente +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
