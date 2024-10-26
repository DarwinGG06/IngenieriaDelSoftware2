/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.abstractfactory;

/**
 *
 * @author darwi
 */
public class FabricaClasica implements FabricaMuebles {

    @Override
    public Mesa crearMesa() {
        return new MesaClasica();
    }

    @Override
    public Silla crearSilla() {
        return new SillaClasica ();
    }
    
}
