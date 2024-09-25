/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.dip;

/**
 *
 * @author darwi
 */
public class UsuarioFun {
    private IServicioDeNotificaciones servicioDeNotificaciones;

    public UsuarioFun(IServicioDeNotificaciones servicioDeNotificaciones) {
        this.servicioDeNotificaciones = servicioDeNotificaciones;
    }
    
    public void enviarCorreo(){
        servicioDeNotificaciones.enviarCorreo();
    }
    
    public void enviarSMS() {
        servicioDeNotificaciones.enviarSMS();
    }
}
