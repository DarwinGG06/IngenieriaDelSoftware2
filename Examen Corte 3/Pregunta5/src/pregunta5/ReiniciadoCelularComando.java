/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta5;

/**
 *
 * @author darwi
 */
public class ReiniciadoCelularComando implements Comando{
    private Celular celular;
    
    public ReiniciadoCelularComando(Celular celular){
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
       celular.reiniciar();
    }
}
