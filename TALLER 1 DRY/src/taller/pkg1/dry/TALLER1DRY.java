/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1.dry;

/**
 *
 * @author darwi
 */
public class TALLER1DRY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instancias
        Email email1 = new Email("ejemplo@asdsad.com");
        Email email2 = new Email("ejemploasdsadcom");
        
        email1.validar();
        email2.validar();

    }
    
    /**Se crea una variable email y no dos como (email1 y email2) y se aplica el priciop dry para evitar duplicar el condicional 
    * y solo se utiliza un condicional eliminando la redundancia
    */
}
