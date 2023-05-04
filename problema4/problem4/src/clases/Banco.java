/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author omerb
 */
public class Banco {

    private String cliente;
    private String nombreBanco;
    private double cheque;
    private double comision;

    public Banco() {
        cliente = "Jose Artega";
        nombreBanco = "Banco de Loja";
        cheque = 240000;
    }

    public Banco(String cli, String banc, double cheq) {
        cliente = cli;
        nombreBanco = banc;
        cheque = cheq;
    }

    public void establecerCliente(String cli) {
        cliente = cli;
    }

    public void establecerNombreBanco(String banc) {
        nombreBanco = banc;
    }

    public void establecerCheque(double cheq) {
        cheque = cheq;
    }

    public void establecerComision() {
        comision = cheque * 0.003;
    }

    public String obtenerCliente() {
        return cliente;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerCheque() {
        return cheque;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {
        String cadena = String.format("Informacion del Cheque\n"
                + "Cliente: %s\n"
                + "Banco: %s\n"
                + "Comision del Banco: %.2f\n"
                + "Cheque: %.2f\n",
                cliente,
                nombreBanco,
                comision,
                cheque);
        return cadena;
    }

}
