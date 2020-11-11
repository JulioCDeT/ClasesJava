package io.juliocdet.poo.interfaces;

import java.util.List;

public abstract class PeliculaRomantica implements Pelicula{
    /* Variables de instancia */
    protected String nombre;
    protected float duracion;
    protected List<String> actores;

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public float getDuracion() {
        return duracion;
    }

    @Override
    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public abstract void setListaActores(List<String> actores);
}
