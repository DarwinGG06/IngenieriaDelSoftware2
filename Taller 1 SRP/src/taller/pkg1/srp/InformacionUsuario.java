/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.srp;

/**
 *
 * @author darwi
 */
public class InformacionUsuario {
    public void obtenerInformacion(Usuario usuario){
        System.out.println("La informacion del Usuario es:"+ System.lineSeparator() + "Nombre del Usuario: " + usuario.getNombre() + System.lineSeparator() + "Correo del Usuario: " + usuario.getCorreo());
    }
}

/** Es una nueva responsabilidad que se encarga de mostras la información del usuario, por esa razon se crea una nueva clase que pertenece al servicio de información de usuario**/
