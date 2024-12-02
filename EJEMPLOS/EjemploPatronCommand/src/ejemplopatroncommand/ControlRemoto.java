/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatroncommand;

/**
 *
 * @author darwi
 */
public class ControlRemoto {
    private Comando comando;
    
    public ControlRemoto(Comando comando){
        this.comando = comando;
    }
    
    public void ejecutar(){
        comando.ejecutar();
    }
}
