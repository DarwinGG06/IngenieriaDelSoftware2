/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg2.dip;

/**
 *
 * @author darwi
 */

//Clase responsable de envios, por eso se emcapsulan todas las interfaces
public class SistemaEnvios {
    private IProcesarOrdenFedex  procesarOrdenFedex;
    private IProcesarOrdenUPS  procesarOrdenUPS;
    private IProcesarOrdenDHL  procesarOrdenDHL;

    public SistemaEnvios(IProcesarOrdenFedex procesarOrdenFedex, IProcesarOrdenUPS procesarOrdenUPS, IProcesarOrdenDHL procesarOrdenDHL) {
        this.procesarOrdenFedex = procesarOrdenFedex;
        this.procesarOrdenUPS = procesarOrdenUPS;
        this.procesarOrdenDHL = procesarOrdenDHL;
    }
    
    public void enviarOrdenFedex(Orden orden){
        procesarOrdenFedex.enviarOrdenFedex(orden);
    }
    
    public void enviarOrdenUPS(Orden orden){
        procesarOrdenUPS.enviarOrdenUPS(orden);
    }
    
    public void enviarOrdenDHL(Orden orden){
        procesarOrdenDHL.enviarOrdenDHL(orden);
    }
}
