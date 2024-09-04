/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1.dip;

/**
 *
 * @author darwi
 */
public class Taller1DIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //
       Usuario usuario = new Usuario("Dar", "234234");
       ServicioDeNotificacionesImpl servicio = new ServicioDeNotificacionesImpl();
       UsuarioFun usuarioFun = new UsuarioFun(servicio);
       
       usuarioFun.enviarCorreo();
       
    }
    
}
