/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg2.ocp;

/**
 *
 * @author darwi
 */
public class CalculoImpuestoIva extends Calculo {

    public CalculoImpuestoIva(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }
    
    @Override
    public double factura() {  
        return this.getPrecio() * 0.19;
    }
    
}
