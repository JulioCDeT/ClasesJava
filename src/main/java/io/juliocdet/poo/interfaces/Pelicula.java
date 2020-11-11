package io.juliocdet.poo.interfaces;

import java.util.List;

/*
* 3 caracteristicas principales:
* 1) Todos sus metodos son abstractos
* 2) Pueden tener constantes, no variables de insntanci ni vairables de clase, solo consntes
* */

public interface Pelicula extends Video {

    /* Constantes de las peliculas */
    // Para las interfaces todas las constantes son: public, static, final
    public static final String FORMATO = "super8";

    /* Metodos de instancia */
    // Todos los metodos de una interfaz por defecto son publicos y son abstractos
    public abstract String getNombre();

    void setNombre(String nombre);

    float getDuracion();

    void setDuracion(float duracion);

    List<String> getActores();

    default String getGenero() {
        return "";
    }
}
