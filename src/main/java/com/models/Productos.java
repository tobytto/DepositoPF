package com.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Productos {
    ArrayList<Producto> productos;

    public Productos() {
        productos = new ArrayList<>(0);
    }

    public void agregarProductos(Producto p){
        productos.add(p);
    }

    public Producto buscarProducto(String nombre) {
        for (Producto p : productos) {
            if (Objects.equals(p.getNombreProd(),nombre)) {
                return p;
            }
        }
        return null;
    }

    public void eliminarProducto(String nombre){
        productos.remove(buscarProducto(nombre));
    }

    public void ordenarProductosNombre(){
        Collections.sort(productos);
    }


}

