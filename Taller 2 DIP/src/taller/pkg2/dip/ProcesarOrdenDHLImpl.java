/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg2.dip;

/**
 *
 * @author darwi
 */
public class ProcesarOrdenDHLImpl implements IProcesarOrdenDHL {

    @Override
    public void enviarOrdenDHL(Orden orden) {
        System.out.println("----Con la operadora DHL----");
        System.out.println(orden.getLugarOrigen());
        System.out.println("Hacia:");
        System.out.println(orden.getLugarDestino());
        System.out.println("-------");
    }
}
