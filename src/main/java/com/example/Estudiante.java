package com.example;

public class Estudiante {
// Atributos Privados

    private String nombre;
    private int edad;
// Constructor 

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
// Metodos Getter Y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Metodo ToString Estudiante Registrado
    @Override
    public String toString() {
        return "Estudiante Registrado: " + nombre + " de " + edad + " años";
    }

}
