/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencorte2.pregunta1;

/**
 *
 * @author darwi
 */
public class Orden {
   
    
    public void calcularTotalConImpuesto(double precio, double descuento){
    double impuesto = precio * 0.1;
    double impuestoConPrecio = precio + impuesto;
    double descuentoPrecio = precio - descuento;
    double descuentoPrecioConImpuesto = descuentoPrecio * 0.1;
        System.out.println("El total con impuesto es: " + impuestoConPrecio + " Y el descuento total es : " + descuentoPrecioConImpuesto );
    }
}
