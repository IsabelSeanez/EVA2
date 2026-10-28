/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_for;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_21_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //acceso por indices --> i
        //Imprmir un listado del 1 al 10
        // 3 parametros
        //punto de partida
        //condicion para detenerse
        //avance
        
        for(int i = 1; i <= 10; i++){
            //INSTRUCCION A REPETIR
            System.out.print(i + " - ");
        }
        System.out.println();
        //20, 22, 24, 26, 28, 30, 31, 36, 38
        for(int i = 20; i<= 38; i+=2){
            System.out.println(i + " - ");
        }
        for(int i = 0; i < 10;){
            
        }
        int x;
        for(x = 10; x >= 1; x--){
            System.out.print(x + " - ");
        }
    }
    
}
