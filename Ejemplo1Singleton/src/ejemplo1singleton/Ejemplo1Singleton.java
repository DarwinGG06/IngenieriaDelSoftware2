/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1singleton;

/**
 *
 * @author darwi
 */
public class Ejemplo1Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Configuracion config = Configuracion.getInstancia();
        
        System.out.println("URL: "  + config.getUrl());
        System.out.println("Usuario: "  + config.getUsuario());
        System.out.println("Password: "  + config.getPassword());
        
        Configuracion otraConfig = Configuracion.getInstancia();
        System.out.println("Son la misma instancia? " + (config == otraConfig));
    }
    
}
