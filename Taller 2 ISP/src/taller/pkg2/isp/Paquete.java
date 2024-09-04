/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg2.isp;

/**
 *
 * @author darwi
 */
public abstract class Paquete {
    private double peso;
    private String dimensiones;

    public Paquete(double peso, String dimensiones) {
        this.peso = peso;
        this.dimensiones = dimensiones;
    }
}
