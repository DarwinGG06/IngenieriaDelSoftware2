/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg2.isp;

/**
 *
 * @author darwi
 */
public class Taller2ISP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancias
        PaquetePequeño pPequeño = new PaquetePequeño(761273, 12323, "asdsad");   
        PaqueteGrande pGrande = new PaqueteGrande(34234.2, "avion", 23432.5, "ghjs");
        PaquetePeligroso pPeligroso = new PaquetePeligroso("sdfsdf", false, 234324.12, "sdfsdfa");
        
        // Metodos
        System.out.println("---PAQUETE PEQUENO---");
        pPequeño.calcularEnvioPequeño();
        
        System.out.println("---PAQUETE GRANDE---");
        pGrande.calcularEnvioGrande();
        
        System.out.println("---PAQUETE PELIGROSO---");
        pPeligroso.asegurarPaquetePeligroso();
        pPeligroso.verificarContenidoPeligroso();
    }
    
    
    
}
