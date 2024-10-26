/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1.prototype;

/**
 *
 * @author darwi
 */
public class Taller1Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto producto1 = new Producto("papas",30.12, "comida");
        Producto producto2 = (Producto) producto1.clone();
        System.out.println(producto1.toString());
        producto2.setNombre("banano");
        producto2.setPrecio(22.00);
        System.out.println(producto2.toString());
    }
    
}
