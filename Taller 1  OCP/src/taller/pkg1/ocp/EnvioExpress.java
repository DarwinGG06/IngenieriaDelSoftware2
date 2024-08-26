/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.ocp;

/**
 *
 * @author darwi
 */
public class EnvioExpress implements Envio {
    public double peso;
    public double distancia;

    public EnvioExpress(double peso, double distancia) {
        this.peso = peso;
        this.distancia = distancia;
    }

    public double getPeso() {
        return peso;
    }

    public double getDistancia() {
        return distancia;
    }
    
    public double getcalcularPrecio(){
        return peso * 1.0 + distancia * 0.2;
    }
}
