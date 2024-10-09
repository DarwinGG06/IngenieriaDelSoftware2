/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1.variaciones.protegidas;

/**
 *
 * @author darwi
 */
public class TALLER1VARIACIONESPROTEGIDAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CanalNotificaciones canalCorreo = new CanalCorreoElectronico();
        CanalNotificaciones canalSMS = new CanalSMS();
        CanalNotificaciones canalWhatsapp = new CanalWhatsapp();
        
        Notificador notificadorC = new Notificador(canalCorreo);
        Notificador notificadorS = new Notificador(canalSMS);
        Notificador notificadorW = new Notificador(canalWhatsapp);
        
        Notificacion notificacion = new Notificacion("adsd", "asdasdsd");
        notificadorC.enviarNotificacion(notificacion);
        notificadorS.enviarNotificacion(notificacion);
        notificadorW.enviarNotificacion(notificacion);
    }
    
}
