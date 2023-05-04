/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutores;

import clases.SueldosMaestros;

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
        SueldosMaestros suelMa=new SueldosMaestros();
        suelMa.establecerSueldoTotal();
        System.out.printf("%s\n",suelMa);
         SueldosMaestros suelMa2=new SueldosMaestros("Julio","Ramires",350,"1215635122");
        suelMa2.establecerSueldoTotal();
        System.out.printf("%s\n",suelMa2);
    }
    
}
