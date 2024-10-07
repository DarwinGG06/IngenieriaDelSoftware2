/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.alta.c.y.bajo.a;

import java.util.Date;
import java.util.List;

/**
 *
 * @author darwi
 */
public class Factura implements IFactura {
    private List<IProducto> productos;
    private ICliente cliente;
    private double descuento;
    private double total;
    private Date fechaFactura;

    public Factura(ICliente cliente, List<IProducto> productos, double descuento) {
        this.cliente = cliente;
        this.productos = productos;
        this.descuento = descuento;
        this.fechaFactura = new Date();
        this.total = calcularTotal();
    }

    @Override
    public double calcularPrecioConDescuento(double descuento) {
        return total - (total * descuento);
    }

    @Override
    public double calcularTotal() {
        return productos.stream().mapToDouble(IProducto::getPrecioProducto).sum();
    }

    @Override
    public void generarNumeroFactura() {
        //Logica
    }

    @Override
    public void procesarFactura(ICliente cliente, List<IProducto> productos) {
        // Lógica para procesar y guardar la factura
        System.out.println("Factura procesada para el cliente: " + cliente.getNombreCliente());
        System.out.println("Total: " + calcularTotal());
        System.out.println("Descuento aplicado: " + calcularPrecioConDescuento(descuento));
    }
}
