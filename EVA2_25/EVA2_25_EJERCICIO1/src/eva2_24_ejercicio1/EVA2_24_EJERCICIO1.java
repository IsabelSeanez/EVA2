/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_24_EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("Inicial: ");
        int ini;
        ini = captu.nextInt();
        System.out.println("Final: ");
        int fin;
        fin = captu.nextInt();
        
        for(int i = ini; i <= fin; i++) {
            System.out.print(i + " - ");
        }
    }
    
}
