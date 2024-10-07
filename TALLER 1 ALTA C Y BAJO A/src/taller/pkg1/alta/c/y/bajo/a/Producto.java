/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.alta.c.y.bajo.a;

/**
 *
 * @author darwi
 */
public class Producto implements IProducto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int getIdProducto() {
        return id;
    }

    @Override
    public String getNombreProducto() {
        return nombre;
    }

    @Override
    public double getPrecioProducto() {
        return precio;
    }
}
