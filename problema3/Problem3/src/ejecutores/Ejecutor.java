/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutores;

import clases.Automotores;

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
        Automotores aut=new  Automotores();
        aut.establecerValorMatricula();
        System.out.printf("%s\n",aut);
         Automotores aut2=new  Automotores("1102629478","Forb",2012,43000);
        aut2.establecerValorMatricula();
        System.out.printf("%s",aut2);
    }
    
}
