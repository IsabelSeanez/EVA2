/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_califas;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA2_10_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el promedio del estudiante (0 a 100): ");
        
        if (scanner.hasNextDouble()) {
            double promedio = scanner.nextDouble();
            
            if (promedio > 100) {
                System.out.println("Dato invalido");
            } else if (promedio >= 90) {
                System.out.println("Sobresaliente");
            } else if (promedio >= 80) {
                System.out.println("Bueno");
            } else if (promedio >= 70) {
                System.out.println("Aceptable");
            } else if (promedio >= 0){
                System.out.println("Insuficiente");
            }
        } else {
            System.out.println("Valor invalido.");
        }
    }
    
}
