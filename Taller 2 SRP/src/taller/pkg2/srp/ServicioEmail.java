/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg2.srp;

/**
 *
 * @author darwi
 */
public class ServicioEmail {
    public void enviarEmailFactura(Cliente cliente, Factura factura){
        System.out.println("Eviando factura al cliente: " + cliente.getNombre() + " con codigo de la factura: " + factura.getCodigo() + " al correo: " + cliente.getCorreo());
    }
    
    public void enviarFacturaDian(Factura factura){
        System.out.println("Enviando factura con codigo: " + factura.getCodigo() + " a la DIAN");
    }
    
}
