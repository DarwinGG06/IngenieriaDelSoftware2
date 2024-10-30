/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencorte2.pregunta4;

/**
 *
 * @author darwi
 */
public class pregunta4 {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        CalculaImpuestos impuestoC = new CalcularImpuestosColombia();
        impuestoC.calcularImpuestos();
        CalculaImpuestos impuestoE = new CalcularImpuestosEEUU();
        impuestoE.calcularImpuestos();
        CalculaImpuestos impuestoF = new CalcularImpuestosFrancia();
        impuestoF.calcularImpuestos();
    }
}
