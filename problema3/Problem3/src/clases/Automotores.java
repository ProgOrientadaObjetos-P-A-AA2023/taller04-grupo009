/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author omerb
 */
public class Automotores {
    private String cedulaDuenio;
    private String marca;
    private int anio;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotores() {
          cedulaDuenio = "115025072";
        marca = "Mazda";
        anio = 2022;
        valorVehiculo = 16500;
    }

    public Automotores(String cedDuenio, String marc, int a, double valorVehi) {
        cedulaDuenio = cedDuenio;
        marca = marc;
        anio = a;
        valorVehiculo = valorVehi;
    }

    public void establecerCedulaDuenio(String ced) {
        cedulaDuenio = ced;
    }

    public void establecerMarca(String marc) {
        marca = marc;
    }

    public void establecerAnio(int a) {
        anio = a;
    }

    public void establecerValorVehiculo(double valorVe) {
        valorVehiculo = valorVe;
    }

    public void establecerValorMatricula() {
       valorMatricula = (0.002*valorVehiculo)*(2023-anio);
    }

    public String obtenerCedulaDuenio() {
        return cedulaDuenio;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAnio() {
        return anio;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Los dato del automotor\n"
                + "Cedula del Dueño: %s\n"
                + "Marca del Vehiculo: %s\n"
                + "Año: %d\n"
                + "Valor Vehiculo: %.2f$\n"
                + "Valor de la matricula: %.2f$\n",
                cedulaDuenio,
                marca,
                anio,
                valorVehiculo,
              valorMatricula);
        return cadena;
    }
            
}
