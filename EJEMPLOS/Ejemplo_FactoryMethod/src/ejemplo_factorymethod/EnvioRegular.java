/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_factorymethod;

/**
 *
 * @author darwi
 */
public class EnvioRegular implements ServicioEnvio{
    
    @Override
    public void enviar() {
        System.out.println("Enviando paquete regular");
    }
}
