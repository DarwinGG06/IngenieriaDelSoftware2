/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatroncommand;

/**
 *
 * @author darwi
 */
public class BombillaPrendidoComando implements Comando{
    private Bombillo bombillo;
    
    public BombillaPrendidoComando(Bombillo bombillo){
        this.bombillo = bombillo;
    }

    @Override
    public void ejecutar() {
        bombillo.prender();
    }
}
