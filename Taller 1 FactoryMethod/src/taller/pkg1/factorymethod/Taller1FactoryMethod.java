/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1.factorymethod;

/**
 *
 * @author darwi
 */
public class Taller1FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instancias
        Creador creadorP = new CreadorPagoPayal();
        Creador creadorT = new CreadorPagoTarejeta();
        
        MetodoDePago pagoP = creadorP.crearMetodoDePago();
        pagoP.procesarPago(5000);
        MetodoDePago pagoT = creadorT.crearMetodoDePago();
        pagoT.procesarPago(5000);
    }
    
}
