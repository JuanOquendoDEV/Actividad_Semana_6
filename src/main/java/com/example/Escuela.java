package com.example;

import java.util.ArrayList;
import java.util.List;

public class Escuela {

    private List<Estudiante> estudiante;
    
    public Escuela() {
        this.estudiante = new ArrayList<>();
    }
   
   
    // Metodo agregar estudiante
    public void addEstudiante(Estudiante estudiante) {
        this.estudiante.add(estudiante);
    }

    // Metodo para mostrar la lista de estudiantes

    public void mostrarEstudiantes() {
        for (Estudiante estudiante : estudiante) {
            System.out.println(estudiante);
        }
    }



}
