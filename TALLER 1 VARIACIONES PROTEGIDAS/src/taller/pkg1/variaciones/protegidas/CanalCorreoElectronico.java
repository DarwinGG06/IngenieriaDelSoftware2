/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.variaciones.protegidas;

/**
 *
 * @author darwi
 */
public class CanalCorreoElectronico implements CanalNotificaciones {

    @Override
    public void enviarNotificaciones(Notificacion notificacion) {
        //logica
        System.out.println("Enviando notificacion por correo electronico");
    }
    
}
