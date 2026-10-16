/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_covid;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_17_COVID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        String enfermedad = "";
        double peso, estatura, IMC;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cual es su edad?");
        edad = captu.nextInt();
        captu.nextLine();
        System.out.println("Tiene alguna enfermedad cronica? (SI/NO)");
        enfermedad = captu.nextLine();
        System.out.println("Cual es su peso en KG?");
        peso = captu.nextDouble();
        System.out.println("Cual es su estatura en MTS?");
        estatura = captu.nextDouble();
        
        IMC = peso / (estatura * estatura);
        System.out.println("Su IMC es: " + IMC);
        if ((edad > 65) || (enfermedad.equals("SI") || IMC >= 25)) {
            System.out.println("PERSONA DE RIESGO");
        }else {
            System.out.println("PERSONA SIN RIESGO");
        }
    }
    
}
