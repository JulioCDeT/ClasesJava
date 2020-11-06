/* el package tiene que se la primera linea efectiva en un programa de Java, los commentarios no cuentan */
package io.juliocdet.classes.structure;


/**
 * @author julio
 * @version 1.0
 * @see "http://miGithub.repo.com"
 */
public class Pastel {

    /* Variables de clase */
    private static int cuentaPasteles;

    /* Variables de instancia */
    private String sabor;
    private char tamano;
    private String color;

    /* Bloque de inicializacion estatico  */
    static {
        cuentaPasteles = 0;
    }

    /* Bloque de inicializacion */ {
        cuentaPasteles++;
    }

    /**
     * Constructor por defecto
     */
    public Pastel() {
        System.out.println("Construyendo pastel");
    }

    /**
     * (constructor paremetrizado)
     * Crear pasteles a partir de parametros
     *
     * @param sabor  (String) El sabor del paster
     * @param tamano (char) El tamaño del pastel
     */
    public Pastel(String sabor, char tamano) {
        this.sabor = sabor;
        this.tamano = tamano;
        System.out.println(String.format("Creando pastel de %s con tamaño %s", sabor, tamano));
    }

    // Getters y setters //
    public int getCuentaPasteles() {
        return cuentaPasteles;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public char getTamano() {
        return tamano;
    }

    public void setTamano(char tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pastel{" +
                "sabor='" + sabor + '\'' +
                ", tamano=" + tamano +
                ", color='" + color + '\'' +
                '}';
    }
}


