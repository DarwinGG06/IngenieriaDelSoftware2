/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.isp;

/**
 *
 * @author darwi
 */
public class Libro implements LibreriaLibro{
    private String nombre;
    private double codigo;

    public Libro(String nombre, double codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCodigo() {
        return codigo;
    }
    
    
    
    @Override
    public void prestar() {
        System.out.println("Se ha prestado el libro con exito " + this.nombre);
    }

    @Override
    public void devolver() {
        System.out.println("Se ha devuelto el libro con exito " + this.nombre);
    }

    @Override
    public void renovarPortada() {
        System.out.println("Se esta renovando la portada del libro " + this.nombre);
    }

    @Override
    public void mantenimientoDeHojas() {
        System.out.println("El libro esta en mantenimiento de hojas " + this.nombre); 
    }

    @Override
    public void solicitarNuevaVersion() {
        System.out.println("Se esta solicitando la nueva version del libro " + this.nombre); 
    }
    
}
