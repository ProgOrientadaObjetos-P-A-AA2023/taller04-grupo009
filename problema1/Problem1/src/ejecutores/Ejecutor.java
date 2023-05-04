/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutores;

import Clases.Notas;

/**
 *
 * @author omerb
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Notas not = new Notas();
        not.establecerPromedioNotas();
        System.out.printf("%s\n", not);
        Notas nota = new Notas("Luis Cabrera",10,7,8);
        nota.establecerPromedioNotas();
        System.out.printf("%s\n", nota);

    }

}
