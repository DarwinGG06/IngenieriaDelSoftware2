/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pregunta1;

/**
 *
 * @author darwi
 */
public class Pregunta1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fabrica fabricaE = new FabricaExpress();
        ServicioEnvio enviarE = fabricaE.crearEnvio();
        
        enviarE.enviar();
        
        Fabrica fabricaR = new FabricaRegular();
        ServicioEnvio enviarR = fabricaR.crearEnvio();
        
        enviarR.enviar();
        
        
    }
    
}
