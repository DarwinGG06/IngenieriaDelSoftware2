/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1.lsp;

/**
 *
 * @author darwi
 */
public class Taller1LSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instancias
        Producto productoDigital = new ProductoDigital(30.5, "asdasd", 80000, 5);
        Producto productoFisico = new ProductoFisico(80, "sdsdf", 3000, 10);
        Producto productoMixto = new ProductoMixto(20.9, 50.4, "", 40000, 8);
        
        //Objeto calcula
        Calcula calcular = new Calcula();
        
        //calcular los costos
        System.out.println("Costo producto digital: " + calcular.calcularCosto(productoDigital));
        System.out.println("Costo producto fisico: " + calcular.calcularCosto(productoFisico));
        System.out.println("Costo producto mixto: " + calcular.calcularCosto(productoMixto));
        
        ProductoFisico productoFisico2 = new ProductoFisico(0, "Ensayo Fisico", 0, 0);
        productoFisico2.enviarCorreo();
        
        ProductoMixto productoMixto2 = new ProductoMixto(0, 0, "Ensayo Mixto", 0, 0);
        productoMixto2.enviarCorreo();
        
    }
    
}
