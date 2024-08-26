/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg2.srp;

/**
 *
 * @author darwi
 */
public class Taller2SRP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instancias 
        Cliente cliente = new Cliente(837434, "Darwin", "darwin@asdsd.com");
        Factura factura = new Factura(1, "pollo", 3, 80000);
        
        //guardar cliente y factura
        ServicioGuardarCliente guardarCliente = new ServicioGuardarCliente();
        guardarCliente.guardarCliente(cliente);
        
        ServicioGuardarFactura guardarFactura =  new ServicioGuardarFactura();
        guardarFactura.guardarFactura(factura);
        
        //enviar email al cliente y DIAN
        ServicioEmail enviarEmailFactura = new ServicioEmail();
        enviarEmailFactura.enviarEmailFactura(cliente, factura);
        
        ServicioEmail enviarFacturaDian = new ServicioEmail();
        enviarFacturaDian.enviarFacturaDian(factura);
        
        //reportes factura
        ServicioReporte generarReporteFacturas = new ServicioReporte();
        generarReporteFacturas.generarReporteFacturas(factura);

    }
    
}

/** 
 Las clases Factura y Cliente tienen multiples responsabilidades, que se deben separar por clases, porque tienen metodos que son responsabilidad de otros servicios**/
 /**Se crean distintas clases de servicios en ServicioGuardarFactura, ServicioGuardarCliente, ServicioReporte y ServicioEmail, porque 
  * representan una responsabilidad distinta que no deben estar en las clases Cliente y Factura**/
