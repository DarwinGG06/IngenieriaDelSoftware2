/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta1;

/**
 *
 * @author darwi
 */
public class FabricaRegular implements Fabrica {

    @Override
    public ServicioEnvio crearEnvio() {
        return new EnviarFormaRegular();
    }
    
}
