/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg3.srp;

/**
 *
 * @author darwi
 */
public class TALLER3SRP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto = new Producto("jabsd", 2234, "oiahsdih", 32454646);
        
        ServicioDeGuardado guardado = new ServicioDeGuardado();
        guardado.guardarProducto(producto);
        
        ServicioEnvio envio = new ServicioEnvio();
        envio.enviarADomicilio(producto);
        
        ServicioStock stock = new ServicioStock();
        stock.aumentarStock(234324);
        stock.disminuirStock(345435435);
        
    }
    
}
