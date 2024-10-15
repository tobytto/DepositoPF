package com.models;

import java.util.Objects;


public abstract class Persona implements Comparable<Persona>{
    private static int contador = 0;
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private String domicilio;

    public Persona(){
        contador++;
        this.id = contador;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Persona setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public int getEdad() {
        return edad;
    }

    public Persona setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Persona setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public Persona setDomicilio(String domicilio) {
        this.domicilio = domicilio;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona person = (Persona) o;

        if(this.hashCode()!= person.hashCode()){return false;}
        return id == person.id && edad == person.edad && Objects.equals(nombre, person.nombre) && Objects.equals(apellido, person.apellido) && Objects.equals(email, person.email) && Objects.equals(domicilio, person.domicilio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, edad, email, domicilio);
    }

    @Override
    public int compareTo(Persona o) {
        return this.getNombre().compareTo(o.getNombre());
    }

    @Override
    public String toString() {
        return "models.Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", domicilio='" + domicilio + '\'' +
                '}';
    }
}
