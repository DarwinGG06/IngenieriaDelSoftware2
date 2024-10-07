/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.alta.c.y.bajo.a;

/**
 *
 * @author darwi
 */
public class Cliente implements ICliente {
    private int id;
    private String nombre;
    private String direccion;

    public Cliente(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public int getIdCliente() {
        return id;
    }

    @Override
    public String getNombreCliente() {
        return nombre;
    }

    @Override
    public String getDireccionCliente() {
        return direccion;
    }
}
