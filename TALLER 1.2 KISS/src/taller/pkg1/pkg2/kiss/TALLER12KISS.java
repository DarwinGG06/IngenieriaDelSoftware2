/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1.pkg2.kiss;

/**
 *
 * @author darwi
 */
public class TALLER12KISS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instancia
        Numero numero = new Numero(new int[]{3,4,1,7,8,1});
        System.out.println("El numero mayor es: " + Numero.encontrarMayor(numero.getNumeros()));
    }
    
}
