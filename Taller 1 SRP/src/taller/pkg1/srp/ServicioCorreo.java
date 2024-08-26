/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.srp;

/**
 *
 * @author darwi
 */
public class ServicioCorreo {
    public void enviarCorreo(Usuario usuario){
        System.out.println("Enviando correo a " + usuario.getCorreo());
    }
}

/** Es una responsabilidad que se encarga de el servicio de correo, entonces se hace una nueva clase que pertenece al servicio de correo **/
