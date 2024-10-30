/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencorte2.pregunta3;

/**
 *
 * @author darwi
 */
public class FacturaElectronica extends Factura{
    public String numeroElectronico;

    public FacturaElectronica(String numeroElectronico, String codigo, double total, Cliente cliente) {
        super(codigo, total, cliente);
        this.numeroElectronico = numeroElectronico;
    }

    @Override
    public void enviarFactura() {
        System.out.println("Enviando Factura Electronica a: " + cliente.getNombre() + " con numero electronico: " + numeroElectronico);
    }
    
    
}
