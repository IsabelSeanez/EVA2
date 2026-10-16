/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_acceso;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EVA2_11_ACCESO {

    /**
     * @param args the command line arguments
     */
      final String USUARIO = "admin";
        final String CONTRA = "admin";
    public static void main(String[] args) {
        String USUARIO, CONTRA;
        Scanner captu = new Scanner(System.in);
        System.out.println("Usuario: ");
        USUARIO = captu.nextLine();
        System.out.println("Contraseña: ");
        CONTRA = captu.nextLine();
        if(USUARIO == USUARIO){
        if(CONTRA == CONTRA){
        System.out.println("ACCESO CONCEDIDO!!!");
        }else{
            System.out.println("ACCESO DENEGADO!!!");
        }
    }
    
}
