/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_expresionesboleanas2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_14_EXPRESIONESBOLEANAS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //AND
        //BECA
        //promedio >= 95 o esta en un equipo representativo
        String equipo;
        int promedio;
        Scanner captu = new Scanner(System.in);
       System.out.println("Perteneces a algun equipo representativo? (SI/NO) ");
       equipo = captu.nextLine();
       System.out.println("Tu prmedio es igual o mayor a 95? (SI/NO) ");
       promedio = captu.nextInt();
       if ((promedio >= 95) || (equipo.equals("SI"))) {
           System.out.println("BECA CONCEDIDA");
       }else{
           System.out.println("BECA DENEGADA");
       }
       //OR
       
       
        
       
       
     
    }
    
}
