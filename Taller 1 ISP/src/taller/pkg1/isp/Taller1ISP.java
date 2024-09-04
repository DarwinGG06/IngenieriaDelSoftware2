/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1.isp;

/**
 *
 * @author darwi
 */
public class Taller1ISP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancias
        Cartilla cartilla = new Cartilla("asdsad", 234);
        DVD dvd = new DVD("sdfdsf", "asdfa");
        Libro libro = new Libro("ghjhgj", 2343212);
        
        // Metodos
        System.out.println("---CARTILLA---");
        cartilla.prestar();
        cartilla.devolver();
        cartilla.mantenimientoDeHojas();
        
        System.out.println("---DVD---");
        dvd.prestar();
        dvd.devolver();
  
        System.out.println("---LIBRO---");
        libro.prestar();
        libro.devolver();
        libro.renovarPortada();
        libro.mantenimientoDeHojas();
        libro.solicitarNuevaVersion();
    }
    
}
