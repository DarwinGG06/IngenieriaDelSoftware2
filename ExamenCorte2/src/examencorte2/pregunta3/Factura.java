/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package examencorte2.pregunta3;

/**
 *
 * @author darwi
 */
public class Factura {
    public String codigo;
    public double total;
    public Cliente cliente;

    public Factura(String codigo, double total, Cliente cliente) {
        this.codigo = codigo;
        this.total = total;
        this.cliente = cliente;
    }
    
    public void enviarFactura(){
    
    }
}
