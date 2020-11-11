package io.juliocdet.poo.interfaces;

public abstract class PeliculaDeAccion implements Pelicula{

    /* Variables de instancia */
    protected String nombre;
    protected float duracion;

    /* metodo de clase */
    public static void metodo() {

    }


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
}
