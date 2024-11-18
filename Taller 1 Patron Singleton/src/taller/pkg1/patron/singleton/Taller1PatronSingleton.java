/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1.patron.singleton;

/**
 *
 * @author darwi
 */
public class Taller1PatronSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Settings settings = Settings.obtenerInstancia();
        
        System.out.println("Tema antes: " + settings.getConfiguracion("theme"));
        System.out.println("Idioma antes: " + settings.getConfiguracion("language"));
        
        settings.setConfiguracion("theme", "dark");
        settings.setConfiguracion("language", "es");
        
        System.out.println("Tema ahora: " + settings.getConfiguracion("theme"));
        System.out.println("Idioma ahora: " + settings.getConfiguracion("language"));
        
        Settings otraSettings = Settings.obtenerInstancia();
        System.out.println("Son la misma instancia?: " + (settings == otraSettings));
        
    }
    
}
