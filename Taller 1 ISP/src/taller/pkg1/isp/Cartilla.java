/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.isp;

/**
 *
 * @author darwi
 */
public class Cartilla implements LibreriaCartilla {
    private String nombre;
    private int nHojas;

    public Cartilla(String nombre, int nHojas) {
        this.nombre = nombre;
        this.nHojas = nHojas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getnHojas() {
        return nHojas;
    }
    
    

    @Override
    public void prestar() {
        System.out.println("Se ha prestado la cartilla con exito " + this.nombre); 
    }

    @Override
    public void devolver() {
        System.out.println("Se ha devuelto la cartilla con exito " + this.nombre); 
    }

    @Override
    public void mantenimientoDeHojas() {
        System.out.println("La cartilla esta en mantenimiento de hojas " + this.nombre); 
    }
}
