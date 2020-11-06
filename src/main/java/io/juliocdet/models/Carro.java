package io.juliocdet.models;

import io.juliocdet.poo.Persona;

public class Carro {
    String marca;
    int ano;

    public Carro() {}
    public Carro(String marca){
        this.marca = marca;
    }
    public Carro(int ano) {
        this.ano = ano;
    }
    public Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", ano=" + ano +
                '}';
    }
}
