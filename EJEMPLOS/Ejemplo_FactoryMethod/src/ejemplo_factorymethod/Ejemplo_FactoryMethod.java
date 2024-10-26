/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_factorymethod;

/**
 *
 * @author darwi
 */
public class Ejemplo_FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Creator creadorE = new CreadoraEnvioExpress();
        Creator creadorR = new CreadoraEnvioRegular();
        
        
        ServicioEnvio envioExpress = creadorE.crearServicioEnvio();
        envioExpress.enviar();
        ServicioEnvio envioRegular = creadorR.crearServicioEnvio();
        envioRegular.enviar();
        
    }
    
}
