/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuento;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_16_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int edad;
       String estudiante = "";
       String credVigente = "";
       String credInsen = "";
       Scanner captu = new Scanner (System.in);
       System.out.println("Cual es tu edad? ");
       edad = captu.nextInt();
       captu.nextLine();
       System.out.println("Eres estudiante? (SI/NO)");
       estudiante = captu.nextLine();
       System.out.println("Tienes credencial vigente? (SI/NO)");
       credVigente = captu.nextLine();
       System.out.println("Tienes credencial del INSEN? (SI/NO)");
       credInsen = captu.nextLine();
       if ((edad < 18) || (estudiante.equals("SI") && (credVigente.equals("SI")) || (edad > 60 && credInsen.equals("SI")))) {
           System.out.println("SI TIENE DESCUENTO");
       }else{
           System.out.println("NO TIENE DESCUENTO");
       }
       
       
       
    }
    
}
