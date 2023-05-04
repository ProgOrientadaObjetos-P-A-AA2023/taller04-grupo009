/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutores;

import clases.Banco;

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
        Banco ban=new Banco();
        ban.establecerComision();
        System.out.printf("%s\n",ban);
         Banco ban2=new Banco("Alvares Salina","Guayaquil",12300);
        ban2.establecerComision();
        System.out.printf("%s\n",ban2);
    }
    
}
