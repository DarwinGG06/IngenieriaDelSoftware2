/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.builder;

import java.util.Set;

/**
 *
 * @author darwi
 */
public class Usuario {
    private String nombre;
    private int edad;
    private String correo;
    private Set<String> intereses;

    public Usuario(String nombre, int edad, String correo, Set<String> intereses) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.intereses = intereses;
    }
    
    
    public Usuario(Builder builder){
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.correo = builder.correo;
        this.intereses = intereses;
    }

    @Override
    public String toString() {
        return nombre + " - " + edad;
    }
    
    
    
    
}
