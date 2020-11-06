package io.juliocdet.poo.tienda.model;

import io.juliocdet.poo.tienda.Cliente;

import java.util.ArrayList;

public class Comprador extends Cliente {

    /* variables de instancia + las heredadas*/
    private String metodoDePago;

    public Comprador(String nombre, float presupuesto, String metodoDePago) {
        super(nombre, presupuesto);
        this.metodoDePago = metodoDePago;
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }
}
