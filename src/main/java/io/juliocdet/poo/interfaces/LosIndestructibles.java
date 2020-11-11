package io.juliocdet.poo.interfaces;

import java.util.Arrays;
import java.util.List;

public class LosIndestructibles extends PeliculaDeAccion{

    private static final List<String> ACTORES = Arrays.asList("Arnol", "El pelon", "El viejito", "El negro");
    private static final float DURACION = 2.0F;

    @Override
    public List<String> getActores() {
        return ACTORES;
    }

}
