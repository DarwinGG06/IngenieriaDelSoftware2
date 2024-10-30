/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencorte2.pregunta3;

/**
 *
 * @author darwi
 */
public class FacturaFisica extends Factura{

    public FacturaFisica(String codigo, double total, Cliente cliente) {
        super(codigo, total, cliente);
    }  

    @Override
    public void enviarFactura() {
        System.out.println("Enviando Factura Fisica a: " + cliente.getNombre());
    }
    
}
