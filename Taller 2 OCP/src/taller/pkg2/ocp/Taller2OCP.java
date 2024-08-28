/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg2.ocp;

/**
 *
 * @author darwi
 */
public class Taller2OCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instancias
        Calculo calculoIva = new CalculoImpuestoIva("pollo", 5, 5000);
        Calculo calculoReteIva = new CalculoImpuestoReteIva("pollo", 5, 5000);
        Calculo calculoIvaSaludable = new CalculoImpuestoSaludable("pollo", 5, 5000);
        
        //Objeto factura
        Factura calcularFactura = new Factura();
        
        //calcular los precios
        System.out.println("Precio Impuesto IVA: " + calcularFactura.calcularFactura(calculoIva));
        System.out.println("Precio Impuesto ICA: " + calcularFactura.calcularFactura(calculoReteIva));
        System.out.println("Precio Impuesto Saludable: " + calcularFactura.calcularFactura(calculoIvaSaludable));
        
    }
    
}
