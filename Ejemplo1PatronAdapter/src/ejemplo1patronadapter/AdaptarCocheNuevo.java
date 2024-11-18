/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1patronadapter;

/**
 *
 * @author darwi
 */
public class AdaptarCocheNuevo implements Vehiculo {
    
    private CocheNuevo cocheNuevo;

    public AdaptarCocheNuevo(CocheNuevo cocheNuevo) {
        this.cocheNuevo = cocheNuevo;
    }
    
    

    @Override
    public void acelerar() {
        cocheNuevo.iniciar();
    }

    @Override
    public void frenar() {
        cocheNuevo.detener();
    }
    
}
