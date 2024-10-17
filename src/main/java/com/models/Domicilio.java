package com.models;

public class Domicilio {
    private String calle;
    private int altura;
    private int piso;
    private char depto;


    public String getCalle() {
        return calle;
    }

    public Domicilio setCalle(String calle) {
        this.calle = calle;
        return this;
    }

    public int getAltura() {
        return altura;
    }

    public Domicilio setAltura(int altura) {
        this.altura = altura;
        return this;
    }

    public int getPiso() {
        return piso;
    }

    public Domicilio setPiso(int piso) {
        this.piso = piso;
        return this;
    }

    public char getDepto() {
        return depto;
    }

    public Domicilio setDepto(char depto) {
        this.depto = depto;
        return this;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "calle='" + calle + '\'' +
                ", altura=" + altura +
                ", piso=" + piso +
                ", depto=" + depto +
                '}';
    }
}
