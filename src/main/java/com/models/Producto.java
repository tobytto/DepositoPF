package com.models;

import java.util.Date;

public abstract class Producto implements Comparable<Producto> {
    private int idProd;
    private static int contador=0;
    private String nombreProd;
    private String marcaProd;
    private String categoriaProd;
    private int Stock;
    private double precio;
    private Date FechaVen;

    public Producto() {
        contador++;
        idProd = contador;
    }

    public int getIdProd() {
        return idProd;
    }


    public String getNombreProd() {
        return nombreProd;
    }

    public Producto setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
        return this;
    }

    public String getMarcaProd() {
        return marcaProd;
    }

    public Producto setMarcaProd(String marcaProd) {
        this.marcaProd = marcaProd;
        return this;
    }

    public String getCategoriaProd() {
        return categoriaProd;
    }

    public Producto setCategoriaProd(String categoriaProd) {
        this.categoriaProd = categoriaProd;
        return this;
    }

    public int getStock() {
        return Stock;
    }

    public Producto setStock(int stock) {
        Stock = stock;
        return this;
    }

    public double getPrecio() {
        return precio;
    }

    public Producto setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public Date getFechaVen() {
        return FechaVen;
    }

    public Producto setFechaVen(Date fechaVen) {
        FechaVen = fechaVen;
        return this;
    }

    @Override
    public int compareTo(Producto o) {
        return this.getMarcaProd().compareTo(o.getMarcaProd());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProd=" + idProd +
                ", nombreProd='" + nombreProd + '\'' +
                ", marcaProd='" + marcaProd + '\'' +
                ", categoriaProd='" + categoriaProd + '\'' +
                ", Stock=" + Stock +
                ", precio=" + precio +
                ", FechaVen=" + FechaVen +
                '}';
    }
}
