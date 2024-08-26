/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1.ocp;

/**
 *
 * @author darwi
 */
public class Taller1OCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instancias
        EnvioEstandar envioEstandar = new EnvioEstandar(30, 80);
        EnvioInternacional envioInternacional = new EnvioInternacional(41, 33);
        EnvioExpress envioExpress = new EnvioExpress(6, 65);
        CalcularPrecioEnvio calcular = new CalcularPrecioEnvio();
        
        //calcular los precios de cada envio y mostarlos
        System.out.println("Precio estandar: " + calcular.calcularPrecio(envioEstandar));
        System.out.println("Precio internacional: " + calcular.calcularPrecio(envioInternacional));
        System.out.println("Precio express: " + calcular.calcularPrecio(envioExpress));
    }
}

/** Para agregar un nuevo tipo de envio debemos modificar el metodo calcularCosto que esta en el taller 
* y extender la funcionalidad de todo el codigo que implemeta una clase envio y asi se extiende y no se modifica*/