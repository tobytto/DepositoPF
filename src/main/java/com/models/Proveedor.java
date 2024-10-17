package com.models;

import com.enums.TipoPersona;
import com.enums.TipoProveedor;

import java.util.ArrayList;

public class Proveedor extends Persona {
    private final TipoPersona tipo;
    private String dni;
    private Productos productosProv;

    public Proveedor(){
        this.tipo = TipoPersona.PROVEEDOR;
        productosProv = new Productos();
    }

    public TipoPersona getTipo() {
        return tipo;
    }

    public String getDni() {
        return dni;
    }

    public Proveedor setDni(String dni) {
        this.dni = dni;
        return this;
    }

    public Productos getProductosProv() {
        return productosProv;
    }

    public Proveedor setProductosProv(Productos productosProv) {
        this.productosProv = productosProv;
        return this;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "tipo=" + tipo +
                ", dni='" + dni + '\'' +
                ", productosProv=" + productosProv +
                '}' + super.toString();
    }
}
