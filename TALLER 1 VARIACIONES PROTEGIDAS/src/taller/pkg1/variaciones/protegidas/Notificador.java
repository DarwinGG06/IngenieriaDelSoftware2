/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.variaciones.protegidas;

/**
 *
 * @author darwi
 */
public class Notificador {
    private CanalNotificaciones notificador;

    public Notificador(CanalNotificaciones notificador) {
        this.notificador = notificador;
    }
    
    public void enviarNotificacion(Notificacion notificacion){
        notificador.enviarNotificaciones(notificacion);
    }
    
    
    
}
