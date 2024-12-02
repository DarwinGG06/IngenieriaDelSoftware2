/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatroncommand;

/**
 *
 * @author darwi
 */
public class VentiladorApagadoComando implements Comando{
    private Ventilador ventilador;
    
    public VentiladorApagadoComando(Ventilador ventilador){
        this.ventilador = ventilador;
    }

    @Override
    public void ejecutar() {
        ventilador.apagar();
    }
}
