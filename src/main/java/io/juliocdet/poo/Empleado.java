package io.juliocdet.poo;

public class Empleado extends Persona{
    protected String rfc;
    protected String numeroSeguroSocial;

    public Empleado() {
        this.nombre = "";
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
}
