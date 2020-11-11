package io.juliocdet.poo.interfaces;

import java.util.List;

public class Rambo extends PeliculaDeAccion{

    private List<String> actores;

    public void setActores(List<String> actores) {
        this.actores = actores;
    }

    @Override
    public List<String> getActores() {
        return actores;
    }

    public String getFormato() {
        return FORMATO;
    }
}
