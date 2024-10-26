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
public class Builder {
    public static String masa;
    public static String tamaño;
    public List<String> ingredientes;

    public Builder setMasa(String masa) {
        this.masa = masa;
        return this;
    }

    public Builder setTamaño(String tamaño) {
        this.tamaño = tamaño;
        return this;
    }

    public Builder setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
        return this;
    }
    public Pizza build(){
        return new Pizza(this);
    }
}
