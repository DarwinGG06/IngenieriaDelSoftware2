/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencorte2.pregunta3;

/**
 *
 * @author darwi
 */
public class pregunta3 {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente cliente = new Cliente("6123gyuvyuv", "Darwin", "sadsad@gmail.com");
        Factura facturaF = new FacturaFisica("asdsd", 213213, cliente);
        Factura facturaE = new FacturaElectronica("823894743", "345345", 861238762, cliente);
        
        facturaF.enviarFactura();
        facturaE.enviarFactura();
    }
}
