/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg3.ocp;

/**
 *
 * @author darwi
 */
public class CalcularImpuesto {
    public double calcularImpuesto(Descuento descuento, Producto producto){
        return descuento.calcularDescuento(producto);
    }
}