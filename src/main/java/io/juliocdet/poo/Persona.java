package io.juliocdet.poo;

public class Persona {

    /* Atributos */
    protected String nombre;
    protected int edad;
    protected String fechaNacimiento;
    protected boolean esMayorDeEdad;
    protected String nacionalidad;
    protected double salarioNeto;

    /* public,      Accesible desde cualquier ubicacion, packate, projecto, etc..
       protected,   Accesible desde clases hijas y clases que esten en el mismo paquete.
       default,     Accesible desde clases del mismo paquete
       private,     Accesible solo dentro de la clase.
    * */

    public Persona() {}

    public Persona(String nombre, int edad, String fechaNacimiento)     {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEsMayorDeEdad() {
        return esMayorDeEdad;
    }

    public void setEsMayorDeEdad(boolean esMayorDeEdad) {
        this.esMayorDeEdad = esMayorDeEdad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad < 120) {
            this.edad = edad;
        } else {
            this.edad = -1;
        }
    }
}
