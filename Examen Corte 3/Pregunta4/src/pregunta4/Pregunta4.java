/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pregunta4;

/**
 *
 * @author darwi
 */
public class Pregunta4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Configuracion configuracion = Configuracion.getInst();
        System.out.println(configuracion.getUsuario());
        System.out.println(configuracion.getUrl());
        System.out.println(configuracion.getPassword());
        
        Configuracion configuracion2 = Configuracion.getInst();
        System.out.println((configuracion == configuracion2));
    }
    
}
