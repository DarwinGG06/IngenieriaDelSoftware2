/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg2.dip;

/**
 *
 * @author darwi
 */
public class Taller2DIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IProcesarOrdenFedex procesarOrdenFedex = new ProcesarOrdenFedexImpl();
        IProcesarOrdenUPS procesarOrdenUPS = new ProcesarOrdenUPSImpl();
        IProcesarOrdenDHL procesarOrdenDHL = new ProcesarOrdenDHLImpl();
        SistemaEnvios sistemaEnvios = new SistemaEnvios(procesarOrdenFedex, procesarOrdenUPS, procesarOrdenDHL);
        Orden orden = new Orden(null, "Manizales", "Bogota");
        sistemaEnvios.enviarOrdenFedex(orden);
        sistemaEnvios.enviarOrdenUPS(orden);
        sistemaEnvios.enviarOrdenDHL(orden);
    }
    
}
