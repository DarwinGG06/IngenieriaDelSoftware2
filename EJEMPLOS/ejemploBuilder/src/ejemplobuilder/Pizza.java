/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplobuilder;

import java.util.List;

/**
 *
 * @author darwi
 */
public class Pizza {
    private String masa;
    private String tamaño;
    private List<String> ingredientes;

    public Pizza(String masa, String tamaño, List<String> ingredientes) {
        this.masa = masa;
        this.tamaño = tamaño;
        this.ingredientes = ingredientes;
    }
    
    public Pizza(Builder builder){
        this.masa = builder.masa;
        this.tamaño = builder.tamaño;
        this.ingredientes = ingredientes;
    }
    
    @Override
    public String toString(){
        return masa + " - " + tamaño;
    }
}
