package com.models;

import com.enums.TipoPersona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;
import com.validaciones.Validaciones;


public abstract class Persona implements Comparable<Persona>{
    private static int contador = 0;
    private int id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private String email;
    private Domicilio domicilio;
    private String dni;
    private boolean active;

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

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public Persona setFechaNac(String fechaNac) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if(Validaciones.validarFecha(fechaNac,formatter)){
            this.fechaNac = LocalDate.parse(fechaNac, formatter) ;
        }
        return this;
    }

    public Persona setDni(String dni){
        //Tarea: realizar una funcion que valide que sea un dni sino dar una excepcion.
        if(Validaciones.validarDNI(dni)){
            this.dni = dni;
            return this;
        }
        return this;
    }
    public String getDni(){
        return this.dni;
    }

    public String getEmail() {
        return email;
    }

    public Persona setEmail(String email) {
        if(Validaciones.validarDNI(email)){
            this.email = email;
            return this;
        }
        return this;
    }

    public boolean getActive(){
        if(!this.active){
            System.out.println("Usuario dado de baja");
        }
        return active;
    }

    public Persona setActive(Boolean active){
        this.active = active;
        return this;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public Persona setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona person = (Persona) o;

        if(this.hashCode()!= person.hashCode()){return false;}
        return id == person.id && fechaNac == person.fechaNac && Objects.equals(nombre, person.nombre) && Objects.equals(apellido, person.apellido) && Objects.equals(email, person.email) && Objects.equals(domicilio, person.domicilio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, fechaNac, email, domicilio);
    }

    @Override
    public int compareTo(Persona o) {
        return this.getNombre().compareTo(o.getNombre());
    }

    @Override
    public String toString() {
        return
                "id:" + id +
                " { Nombre: " + nombre + '\'' +
                ", apellido: " + apellido + '\'' +
                ", fecha de nacimiento:" + fechaNac +
                ", email: " + email + '\'' +
                ", domicilio: " + domicilio + '\'' +
                '}';
    }
}
