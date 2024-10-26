/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2_factorymethod;

/**
 *
 * @author darwi
 */
public class Ejemplo2_factoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Creator creadorE = new CreadoraNotificacionEmail();
        Creator creadorS = new CreadoraNotificacionSms();
        
        Notificacion notificacionEmail = creadorE.enviarNotificacion();
        Notificacion notificacionSMS = creadorS.enviarNotificacion();
        
        notificacionEmail.enviar();
        notificacionSMS.enviar();
    }
    
}
