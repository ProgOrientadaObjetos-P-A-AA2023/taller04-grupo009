/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author omerb
 */
public class SueldosMaestros {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public SueldosMaestros() {
        nombre = "Jose";
        apellido = "Mendoza";
        sueldoBasico = 500;
        cedula = "1231532514";
    }

    public SueldosMaestros(String nom, String ape, double suelBasic, String ced) {
        nombre = nom;
        apellido = ape;
        sueldoBasico = suelBasic;
        cedula = ced;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerApellido(String ape) {
        apellido = ape;
    }

    public void establecerSueldoBasico(double suelBasic) {
        sueldoBasico = suelBasic;
    }

    public void establecerSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);
    }

    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public String obtenerCedula() {
        return cedula;
    }

     @Override
    public String toString() {
        String cadena = String.format("Sueldo del Docente\n"
                + "Nombre del Docente: %s\n"
                + "Apellido del Docente: %s\n"
                + "Sueldo Basico: %.2f$\n"
                + "Sueldo Basico 20 porciento: %.2f$\n"
                + "Sueldo Total: %.2f$\n",
                nombre,
                apellido,
                sueldoBasico,
                (sueldoBasico*0.20),
                sueldoTotal);
        return cadena;
    }

}
