/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg3.ocp;

/**
 *
 * @author darwi
 */
public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    private String categoria;
    private int impuesto;

    public Producto(String nombre, double precio, int stock, String categoria, int impuesto) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
        this.impuesto = impuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
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


