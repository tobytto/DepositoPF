package com.models;

import com.enums.TipoPersona;

import java.util.ArrayList;

public class Cliente extends Persona {
    private TipoPersona tipo;
    private String dni;
    public Productos productosCliente;

    public Cliente(){
        this.tipo = TipoPersona.CLIENTE;
        productosCliente = new Productos();
    }

    public TipoPersona getTipo() {
        return tipo;
    }

    public Cliente setTipo(TipoPersona tipo) {
        this.tipo = tipo;
        return this;
    }

    public String getDni() {
        return dni;
    }

    public Cliente setDni(String dni) {
        this.dni = dni;
        return this;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "tipo=" + tipo +
                ", dni='" + dni + '\'' +
                '}' + super.toString();
    }
}
