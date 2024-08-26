/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg2.srp;

/**
 *
 * @author darwi
 */
public class ServicioReporte {
    public void generarReporteFacturas(Factura factura){
        System.out.println("Creando reporte de las facturas con codigo: " + factura.getCodigo() + " producto: " + factura.getPorducto() +" cantidad: " + factura.getCantidad() + " valor total: " + factura.getValorTotal());
    }
}
