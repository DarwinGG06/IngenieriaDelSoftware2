/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.indireccion;

/**
 *
 * @author darwi
 */
public class ServicioNotificacionesGmail implements IServicioNotificacionesGmail{

    @Override
    public CorreoGmail generarCorreo(Usuario usuario) {
        CorreoGmail gmail = new CorreoGmail();
        gmail.setUsuario(usuario);
        return gmail;
    }
    
}