package com.models;

import java.util.ArrayList;
import java.util.Collections;

public class Productos {
    ArrayList<Producto> productos;

    public Productos() {
        productos = new ArrayList<>(0);
    }

    public void agregarProductos(Producto p){
        productos.add(p);
    }

    public Producto buscarProducto(int index) {
        for (Producto p : productos) {
            if (p.getIdProd() == index) {
                return p;
            }
        }
        return null;
    }

    public void eliminarProducto(int index){
        productos.remove(buscarProducto(index));
    }

    public void ordenarProductosNombre(){
        Collections.sort(productos);
    }


}

