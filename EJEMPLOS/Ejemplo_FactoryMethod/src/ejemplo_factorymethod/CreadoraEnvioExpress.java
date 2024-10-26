/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_factorymethod;

/**
 *
 * @author darwi
 */
public class CreadoraEnvioExpress extends Creator{

    @Override
    public ServicioEnvio crearServicioEnvio() {
        return new EnvioExpress();
    }
    
}
