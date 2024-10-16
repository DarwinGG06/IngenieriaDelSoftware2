/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talle.pkg1.polimorfismo;

/**
 *
 * @author darwi
 */
public class Coche implements Transporte{
    
    @Override
    public void acelerar() {
        System.out.println("El Coche acelera");
    }

    @Override
    public void frenar() {
        System.out.println("El Coche frena");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Informacion de el coche");
    }
}