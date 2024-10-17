package com.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Personas {
    ArrayList<Persona> personas;

    public Personas() {
        this.personas = new ArrayList<>();
    }

    public void mostrarPersonas() {
        for (Persona p : personas) {
            System.out.println(p);
        }
    }

    public Persona buscarPersona(String nombre) {
        for (Persona p : personas) {
            if (Objects.equals(p.getNombre(), nombre)) {
                return p;
            }
        }
        return null;
    }

    public Persona buscarPersona(int index){
        for (Persona p: personas){
            if(Objects.equals(p.getId(),index)){
                return p;
            }
        }
        return null;
    }

    public void eliminarPorNombre(String nombre){
        for (Persona p: personas) {
            personas.remove(buscarPersona(nombre));
        }
    }

    public void eliminarPorIndex(int index){
        for(Persona p: personas){
            personas.remove(buscarPersona(index));
        }
    }

    public Persona buscarPorDNI(String dni){
        for(Persona p: personas){
            if(Objects.equals(p.getDni(),dni)){
                return p;
            }
        }
        return null;
    }

    public void ordenarPorNombre(){
        Collections.sort(personas);
    }

    public void darBajaPersona(String dni){
        for(Persona p: personas){
            if(Objects.equals(p.getDni(),dni)){
                p.setActive(false);
            }
        }
    }

    public void mostrarPersonasActivas(){
        for(Persona p: personas){
            if(p.getActive()){
                System.out.println(p);
            }
        }
    }




}