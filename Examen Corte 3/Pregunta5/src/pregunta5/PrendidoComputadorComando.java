/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta5;

/**
 *
 * @author darwi
 */
public class PrendidoComputadorComando implements Comando {
    private Computador computador;
    
    public PrendidoComputadorComando(Computador computador){
        this.computador = computador;
    }
    
    @Override
    public void ejecutar() {
        computador.prender();
    }
}
