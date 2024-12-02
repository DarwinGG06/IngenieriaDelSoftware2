/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta5;

/**
 *
 * @author darwi
 */
public class PrenderCelularComando implements Comando{
    private Celular celular;
    
    public PrenderCelularComando(Celular celular){
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
       celular.prender();
    }
}
