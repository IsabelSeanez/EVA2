/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_expresionesboleanas;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EVA2_13_EXPRESIONESBOLEANAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // AND ---> && PARA QUE SEA VERDADERO LAS DOS DEBEN SER VERDADERAS
        
        boolean entrarAntro, tieneCredencial = true;
        int edad = 18;
        entrarAntro = (edad >= 18) && (tieneCredencial == true);
        System.out.println("Permiso para entrar: " + entrarAntro);
        
        //OR---> || PARA QUE SEA VERDADERO, SOLO UNA DEBE SER VERDAD
        
        boolean estaSoleado = false, tieneDinero = false;
        boolean permisoSalir;
        
        permisoSalir = (estaSoleado == true) || (tieneDinero == true);
        System.out.println("Permiso para salir de paseo: " + permisoSalir);
        
        //NOT ---> !
        
        
    }
    
}
