/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.isp;

/**
 *
 * @author darwi
 */
public class DVD implements LibreriaDVD {
    private String nombre;
    private String tamano;

    public DVD(String nombre, String tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTamano() {
        return tamano;
    }
    
    

    @Override
    public void prestar() {
        System.out.println("Se ha prestado el DVD con exito " + this.nombre);
    }

    @Override
    public void devolver() {
        System.out.println("Se ha devueto el DVD con exito " + this.nombre);
    }
    
}
