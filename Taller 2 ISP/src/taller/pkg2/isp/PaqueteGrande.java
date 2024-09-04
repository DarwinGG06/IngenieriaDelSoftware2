/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg2.isp;

/**
 *
 * @author darwi
 */
public class PaqueteGrande extends Paquete implements PaqueteGrandeInter {
    private double volumen;
    private String medioDeTransporte;

    public PaqueteGrande(double volumen, String medioDeTransporte, double peso, String dimensiones) {
        super(peso, dimensiones);
        this.volumen = volumen;
        this.medioDeTransporte = medioDeTransporte;
    }

    public double getVolumen() {
        return volumen;
    }

    public String getMedioDeTransporte() {
        return medioDeTransporte;
    }
    
    

    @Override
    public void calcularEnvioGrande() {
        System.out.println("Se calcula el costo del envio grande");
    }
    
    
}
