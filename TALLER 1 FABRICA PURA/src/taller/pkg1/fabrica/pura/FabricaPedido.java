/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.fabrica.pura;

import java.util.Date;
import java.util.List;

/**
 *
 * @author darwi
 */
public class FabricaPedido {
    public Pedido crearPedido(int id, Date fecha, Cliente cliente, List<Producto> productos){
        return new Pedido(id, fecha, cliente, productos);
    }
}
