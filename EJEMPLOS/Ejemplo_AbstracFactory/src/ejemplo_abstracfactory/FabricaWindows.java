/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_abstracfactory;

/**
 *
 * @author darwi
 */
public class FabricaWindows implements Fabrica{

    @Override
    public Boton crearBoton() {
        return new BotonMac();
    }

    @Override
    public CuadroTexto cuadroTexto() {
        return new CuadroTextoMac();
    }
    
}
