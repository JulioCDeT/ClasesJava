package io.juliocdet.models;

public class Credencial {
    /* Atributos */
    String nombre;
    int edad;
    String nacionalidad;
    String id;

    /* Constructores */
    private Credencial() {}

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    private void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    private void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public static Credencial crearCredencial(String datos) {
        Credencial credencial = new Credencial();
        String[] datosSeparados = datos.split(" ");
        credencial.setNombre(datosSeparados[1]);
        credencial.setEdad(Integer.parseInt(datosSeparados[3]));
        credencial.setNacionalidad(datosSeparados[5]);
        credencial.setId(datosSeparados[7]);
        return credencial;
    }
}
