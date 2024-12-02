/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatroncommand;

/**
 *
 * @author darwi
 */
public class BombilloApagadoComando implements Comando{
    private Bombillo bombillo;
    
    public BombilloApagadoComando(Bombillo bombillo){
        this.bombillo = bombillo;
    }

    @Override
    public void ejecutar() {
        bombillo.apagar();
    }
    
}
