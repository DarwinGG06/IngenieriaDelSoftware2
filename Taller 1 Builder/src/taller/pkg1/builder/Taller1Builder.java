/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1.builder;

/**
 *
 * @author darwi
 */
public class Taller1Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Builder builder = new Builder()
                .setNombre("Darwin")
                .setEdad(20)
                .setCorreo("darwin@gmail.com");
        Usuario usu = new Usuario(builder);
        System.out.println(usu.toString());  
    }
    
}
