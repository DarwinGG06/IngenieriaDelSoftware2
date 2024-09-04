/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg2.isp;

/**
 *
 * @author darwi
 */
public class PaquetePequeño extends Paquete implements PaquetePequeñoInter {
    private double valorDeclarado;

    public PaquetePequeño(double valorDeclarado, double peso, String dimensiones) {
        super(peso, dimensiones);
        this.valorDeclarado = valorDeclarado;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }
    
    
    
    @Override
    public void calcularEnvioPequeño() {
        System.out.println("Se calcula el costo del envio pequeno");
    }
    
}
