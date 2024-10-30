/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencorte2.pregunta2;

/**
 *
 * @author darwi
 */
public class pregunta2 {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Notificacion notificacionW = new NotifcacionWhatsapp();
        notificacionW.enviarNotificacion();
        Notificacion notificacionS = new NotficacionSMS();
        notificacionS.enviarNotificacion();
        
        ITarea tarea = new Tarea();
        tarea.insertarTarea();
        tarea.leerTarea();
    }
}
