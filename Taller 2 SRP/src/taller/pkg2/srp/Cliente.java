/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg2.srp;

/**
 *
 * @author darwi
 */
public class Cliente {
    public int indentificiacion;
    public String nombre;
    public String correo;

    public Cliente(int indentificiacion, String nombre, String correo) {
        this.indentificiacion = indentificiacion;
        this.nombre = nombre;
        this.correo = correo;
    }

    public int getIndentificiacion() {
        return indentificiacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
    
    
}
