/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2_factorymethod;

/**
 *
 * @author darwi
 */
public class CreadoraNotificacionSms extends Creator {

    @Override
    public Notificacion enviarNotificacion() {
        return new NotificacionSMS();
    }
    
}
