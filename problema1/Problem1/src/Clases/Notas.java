/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author omerb
 */
public class Notas {

    private String nombreEstudiante;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double promedioNotas;

    public Notas() {
        nombreEstudiante = "Carlos Mejia";
        calificacionMateria1 = 10;
        calificacionMateria2 = 5;
        calificacionMateria3 = 3;
    }

    public Notas(String nombre, double cali1, double cali2, double cali3) {
        nombreEstudiante = nombre;
        calificacionMateria1 = cali1;
        calificacionMateria2 = cali2;
        calificacionMateria3 = cali3;
    }

    public void establecerNombreEstudiante(String nom) {
        nombreEstudiante = nom;
    }

    public void establecerCaficacionMateria1(double cafi1) {
        calificacionMateria1 = cafi1;
    }

    public void establecerCaficacionMateria2(double cafi2) {
        calificacionMateria2 = cafi2;
    }

    public void establecerCaficacionMateria3(double cafi3) {
        calificacionMateria3 = cafi3;
    }

    public void establecerPromedioNotas() {
        promedioNotas = (calificacionMateria1 + calificacionMateria2
                + calificacionMateria3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCaficacionMateria1() {
        return calificacionMateria1;
    }

    public double obtenerCaficacionMateria2() {
        return calificacionMateria2;
    }

    public double obtenerCaficacionMateria3() {
        return calificacionMateria3;
    }

    public double obtenerPromedioNotas() {
        return promedioNotas;
    }

     @Override
    public String toString() {
        String cadena = String.format("Los datos de Notas\n"
                + "Nombre del Estudiante: %s\n"
                + "Calificacion 1: %.2f\n"
                + "Calificacion 2: %.2f\n"
                + "Calificacion 3: %.2f\n"
                + "Premedio: %.2f\n",
                nombreEstudiante,
                calificacionMateria1,
                calificacionMateria2,
                calificacionMateria3,
                promedioNotas);
        return cadena;
    }
}
