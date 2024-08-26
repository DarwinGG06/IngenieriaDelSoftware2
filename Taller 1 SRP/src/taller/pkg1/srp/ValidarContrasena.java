/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.srp;

/**
 *
 * @author darwi
 */
public class ValidarContrasena {
    public boolean validarContrasena(Usuario usuario, String contrasena){
        if(usuario.getContrasena() == contrasena){
            return true;
        }else{
            return false;
        }
    }
}

/** Es una nueva responsabilidad que se encarga de validar contraseñas, entonces se hace una nueva clase que pertenece a un servicio de validación de contraseñas **/
