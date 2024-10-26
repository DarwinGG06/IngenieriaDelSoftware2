/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplobuilder;

/**
 *
 * @author darwi
 */
public class EjemploBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Builder builder = new Builder()
                .setMasa("Masita")
                .setTamaño("Tamanito");
        Pizza pizza = new Pizza(builder);
        System.out.println(pizza.toString());                   
    }
    
}
