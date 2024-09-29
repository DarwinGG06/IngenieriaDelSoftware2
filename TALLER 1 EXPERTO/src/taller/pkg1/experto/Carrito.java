/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.experto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author darwi
 */
public class Carrito {
    private List<Libro> libros = new ArrayList<>();
    
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    
    //Logica para hacer eliminar, actualizar y leer
    
    
    public double calcularPrecioTotal(){
        double total = 0;
        for(Libro libro : libros){
            total += libro.getPrecio() * libro.getCantidad(); 
        }
        return total;
    }
}
