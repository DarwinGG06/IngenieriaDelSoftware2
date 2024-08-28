/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg2.ocp;

/**
 *
 * @author darwi
 */
public class CalculoImpuestoReteIva extends Calculo {
    
    private float porcentajeReteIva;

    public CalculoImpuestoReteIva(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }
    

    @Override
    double factura() {
        return this.getPrecio() * 0.10;
    }
}
