/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.srp;

/**
 *
 * @author darwi
 */
public class Usuario {
    public String nombre;
    public String correo;
    public String contrasena;
    public double horasTrabajadas;

    public Usuario(String nombre, String correo, String contrasena, double horasTrabajadas){
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.horasTrabajadas = horasTrabajadas;
    }   
    public String getNombre(){
        return nombre;
    }
    public String getCorreo(){
        return correo;
    }
    public String getContrasena(){
        return contrasena;
    }
    public double getHorasTrabajadas(){
        return horasTrabajadas;
    }
}

/**La clase usuario viola el princiopio de resposabilidad unica (SRP), porque tiene muchas responsabilidades, 
 * que tienen que ser separadas en diferentes clase **/
