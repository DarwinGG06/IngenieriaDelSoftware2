/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.pkg1.kiss;

/**
 *
 * @author darwi
 */
public class Cadena {
    public String cadena;

    public Cadena(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }
    
    

    public static String invertirCadena(String cadena){
        return new StringBuilder(cadena).reverse().toString();
    }
}
