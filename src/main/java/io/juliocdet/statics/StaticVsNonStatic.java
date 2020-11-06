package io.juliocdet.statics;

public class StaticVsNonStatic {

    /*
        Los metodos NO estatico pueden acceder a todos los atributos y metodos de la clase
        ya sean estos staticos o no.

        Mientras que los metodos ESTATICOS SOLO pueden invocar y utilizar variables y metodos
        estaticos.
    */

    /* metodo princial (Es estatico) */
    public static void main(String[] args) {
        System.out.println(saludar("Emmanuel"));
    }

    // Variables no estaca (variables de instancia)
    String algo;

    // MEtodo de instancia
    public String saludarNoEstatico(String nombre) {
        return SALUDO_GENERICO + nombre;
    }

    // Variable statico (Variable de clase)
    // En este caso una constatnte
    public final static String SALUDO_GENERICO = "Hola como estas ";
    public final static String EMPTY_STRING = "";

    // Metodo
    public static String saludar(String nombre) {
        return SALUDO_GENERICO + nombre;
    }
}
