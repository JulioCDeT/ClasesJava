package io.juliocdet.poo.tienda;

import io.juliocdet.poo.tienda.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    /* variables de isntancia */
    protected String nombre;
    protected float presupuesto;
    protected List<Producto> listaProductos;

    public Cliente (String nombre, float presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.listaProductos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void agregarAlCarrito(Producto producto) {
        listaProductos.add(producto);
    }

    public int getCantidadProductosAComprar() {
        return listaProductos.size();
    }

    public void limpiarLista() {
        listaProductos.clear();
    }
}
