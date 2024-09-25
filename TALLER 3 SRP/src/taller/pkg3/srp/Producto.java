/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg3.srp;

/**
 *
 * @author darwi
 */
public class Producto {
    private String nombre;
    private int stock;
    private String categoria;
    private int impuesto;

    public Producto(String nombre, int stock, String categoria, int impuesto) {
        this.nombre = nombre;
        this.stock = stock;
        this.categoria = categoria;
        this.impuesto = impuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getImpuesto() {
        return impuesto;
    }
    
    
}


