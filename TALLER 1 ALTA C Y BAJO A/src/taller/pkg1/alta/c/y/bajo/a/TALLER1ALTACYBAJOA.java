/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1.alta.c.y.bajo.a;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author darwi
 */
public class TALLER1ALTACYBAJOA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IProducto producto1 = new Producto(324234, "kasmdksad", 87687.324);
        

       
        List<IProducto> productos = new ArrayList<>();
        productos.add(producto1);

       
        ICliente cliente = new Cliente(878798, "osndkasn d", "iansdoiasnd");

        
        double descuento = 0.1;
        IFactura factura = new Factura(cliente, productos, descuento);

        
        factura.procesarFactura(cliente, productos);

        
        System.out.println("Total sin descuento: " + factura.calcularTotal());
        System.out.println("Total con descuento: " + factura.calcularPrecioConDescuento(descuento));
    }
}
    
    

