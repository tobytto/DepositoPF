package com.models;

import com.enums.CatProducto;

import java.util.Date;
import java.util.Objects;

public abstract class Producto implements Comparable<Producto> {
    private int idProd;
    private static int contador=0;
    private String nombreProd;
    private String marcaProd;
    private CatProducto categoriaProd;
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

    public CatProducto getCategoriaProd() {
        return categoriaProd;
    }

    public Producto setCategoriaProd(CatProducto categoriaProd) {
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

    public void vender(int cant){
        if(this.Stock>cant){
            this.Stock -= cant;
        }else{
            System.out.println("No hay stock suficiente");
        }
    }

    public void agregar(int cant){
        this.Stock += cant;
    }


    @Override
    public int compareTo(Producto o) {
        return this.getMarcaProd().compareTo(o.getMarcaProd());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return idProd == producto.idProd && Stock == producto.Stock && Double.compare(precio, producto.precio) == 0 && Objects.equals(nombreProd, producto.nombreProd) && Objects.equals(marcaProd, producto.marcaProd) && Objects.equals(categoriaProd, producto.categoriaProd) && Objects.equals(FechaVen, producto.FechaVen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProd, nombreProd, marcaProd, categoriaProd, Stock, precio, FechaVen);
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
