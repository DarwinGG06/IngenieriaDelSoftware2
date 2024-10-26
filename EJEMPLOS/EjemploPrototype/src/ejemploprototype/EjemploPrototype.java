/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploprototype;

/**
 *
 * @author darwi
 */
public class EjemploPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro1 = new Libro("asdasd", "asdasd");
        Libro libro2 = (Libro) libro1.clone();
        System.out.println(libro1.toString());
        libro2.setTitulo("Titulo");
        System.out.println(libro2.toString());
    }
    
}
