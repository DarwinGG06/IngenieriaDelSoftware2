/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package taller.pkg1.alta.c.y.bajo.a;

import java.util.List;

/**
 *
 * @author darwi
 */
public interface IFactura {
    public void procesarFactura(ICliente cliente, List<IProducto> productos);
    public double calcularTotal();
    public double calcularPrecioConDescuento(double descuento);
    public void generarNumeroFactura();
}
