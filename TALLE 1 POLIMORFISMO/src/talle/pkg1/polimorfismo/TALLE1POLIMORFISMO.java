/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package talle.pkg1.polimorfismo;

/**
 *
 * @author darwi
 */
public class TALLE1POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instancias
        Coche coche = new Coche();
        Avion avion = new Avion();
        Bicicleta bicicleta = new Bicicleta();
        Garage garage = new Garage();
        
        garage.estacionarTransporte(avion);
        garage.estacionarTransporte(bicicleta);
        garage.estacionarTransporte(coche);
    }
    
}
