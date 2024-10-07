/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talle.pkg1.polimorfismo;

/**
 *
 * @author darwi
 */
public class Garage {
    public void estacionarTransporte(Transporte transporte){
        System.out.println("Estacionando transporte: " + transporte);
        transporte.mostrarInformacion();
    }
}
