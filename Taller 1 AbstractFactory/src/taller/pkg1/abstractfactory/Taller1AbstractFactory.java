/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1.abstractfactory;

/**
 *
 * @author darwi
 */
public class Taller1AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instancias de frabrica clasica y moderna
        FabricaMuebles fabricaC = new FabricaClasica();
        FabricaMuebles fabricaM = new FabricaModerna();
        
        //fabrica clasica
        Silla sillaC = fabricaC.crearSilla();
        Mesa mesaC = fabricaC.crearMesa();
        
        sillaC.crear();
        mesaC.crear();
        
        //fabrica moderna
        Silla sillaM = fabricaM.crearSilla();
        Mesa mesaM = fabricaM.crearMesa();
        
        sillaM.crear();
        mesaM.crear();
    }
    
}
