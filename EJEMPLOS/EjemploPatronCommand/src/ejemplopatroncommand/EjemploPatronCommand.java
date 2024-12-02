/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopatroncommand;

/**
 *
 * @author darwi
 */
public class EjemploPatronCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bombillo bom = new Bombillo();
        Ventilador ven = new Ventilador();
        
        Comando bombilloApagado = new BombilloApagadoComando(bom);
        ControlRemoto control = new ControlRemoto(bombilloApagado);
        control.ejecutar();
    }
    
}
