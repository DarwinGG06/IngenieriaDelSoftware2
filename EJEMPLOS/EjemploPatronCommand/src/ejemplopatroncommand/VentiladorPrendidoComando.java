/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatroncommand;

/**
 *
 * @author darwi
 */
public class VentiladorPrendidoComando implements Comando {
    private Ventilador ventilador;
    
    public VentiladorPrendidoComando(Ventilador ventilador){
        this.ventilador = ventilador;
    }

    @Override
    public void ejecutar() {
        ventilador.prender();
    }
}
