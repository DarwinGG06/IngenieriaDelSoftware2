/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pregunta5;

/**
 *
 * @author darwi
 */
public class Pregunta5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Celular celular = new Celular();
        
        Comando celularApagado = new ApagadoCelularComando(celular);
        Control control = new Control(celularApagado);
        control.ejecutar();
        
        Computador computador = new Computador();
        Comando computadorApagado = new ApagadoComputadorComando(computador);
        control = new Control(computadorApagado);
        control.ejecutar();
        
        //Asi con los demás
    }
    
}
