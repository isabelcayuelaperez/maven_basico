package org.example;

import java.util.Objects;

public class Persona {
    private int edad;
    private String nombre;
    private String apellidos;

    public Persona(int edad, String nombre, String apellidos) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return  "{edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre) && Objects.equals(apellidos, persona.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edad, nombre, apellidos);
    }

}
