/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta5;

/**
 *
 * @author darwi
 */
public class SuspendidoCelularComando implements Comando {
    private Celular celular;
    
    public SuspendidoCelularComando(Celular celular){
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
       celular.suspender();
    }
}
