/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.indireccion;

/**
 *
 * @author darwi
 */
public class ServicioNotificacionesOutlook implements IServicioNotificacionesOutlook{

    @Override
    public CorreoOutlook generarCorreo(Usuario usuario) {
        CorreoOutlook outlook = new CorreoOutlook();
        outlook.setUsuario(usuario);
        return outlook;
    }
    
}
