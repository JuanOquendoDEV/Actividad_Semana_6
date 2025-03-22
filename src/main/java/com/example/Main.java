package com.example;

public class Main {
    public static void main(String[] args) {
        Escuela escuela = new Escuela();
        Estudiante estudiante1 = new Estudiante("Juan", 13);
        Estudiante estudiante2 = new Estudiante("Maria", 11);
        Estudiante estudiante3 = new Estudiante("Pedro", 14);
        escuela.addEstudiante(estudiante1);
        escuela.addEstudiante(estudiante2);
        escuela.addEstudiante(estudiante3);
        escuela.mostrarEstudiantes();


    }
}