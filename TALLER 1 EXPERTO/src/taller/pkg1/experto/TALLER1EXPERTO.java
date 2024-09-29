/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1.experto;

/**
 *
 * @author darwi
 */
public class TALLER1EXPERTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instancia
        Libro libro1 = new Libro("dsfsdf", "esfdsf", "dsfdsfdsf", 324234, 4543656);
        Carrito carro1 = new Carrito();
        
        carro1.agregarLibro(libro1);
        
        double precio = carro1.calcularPrecioTotal();
        System.out.println("Precio de los o el libro: " + precio);
        
    }
    
}
