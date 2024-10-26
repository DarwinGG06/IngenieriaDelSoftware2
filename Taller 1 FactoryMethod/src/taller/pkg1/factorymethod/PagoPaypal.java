/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.factorymethod;

/**
 *
 * @author darwi
 */
public class PagoPaypal implements MetodoDePago {

    @Override
    public void procesarPago(int cantidad) {
        System.out.println("Procesando el pago con Paypal de: " + cantidad);
    }
    
}