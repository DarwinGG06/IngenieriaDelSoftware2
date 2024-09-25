/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.dip;

/**
 *
 * @author darwi
 */
public class ServicioDeNotificacionesImpl implements IServicioDeNotificaciones{

    @Override
    public void enviarCorreo() {
        System.out.println("Estoy enviadno el correo");
    }
    
    @Override
    public void enviarSMS() {
        System.out.println("Estoy enviadno el SMS");
    }
    
}
