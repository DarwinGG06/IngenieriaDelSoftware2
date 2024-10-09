/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1.indireccion;

/**
 *
 * @author darwi
 */
public class TALLER1INDIRECCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IServicioNotificacionesGmail servicioNotificacionesGmail = new ServicioNotificacionesGmail();
        Usuario usuario = new Usuario("asdasd", "kasdsd@asdasd");
        CorreoGmail gmail = (CorreoGmail) servicioNotificacionesGmail.generarCorreo(usuario);
        System.out.println(gmail.getUsusario());
    }
    
}
