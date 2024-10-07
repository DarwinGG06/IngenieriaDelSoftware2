/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1.fabrica.pura;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author darwi
 */
public class TALLER1FABRICAPURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaPedido fabricaPedido = new FabricaPedido();
        

        Cliente cliente = new Cliente("sadfdsf", "dsfsdfdsf");

        
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("dsfsdf", 34234, 324234));

        
        int idPedido = 23434;
        Date fechaPedido = new Date();
        
        Pedido pedido = fabricaPedido.crearPedido(idPedido, fechaPedido, cliente, productos);


        System.out.println("Pedido ID: " + pedido.getId());
        System.out.println("Fecha del pedido: " + pedido.getFecha());
        System.out.println("Cliente: " + pedido.getCliente().getNombre());
        System.out.println("Direccion: " + pedido.getCliente().getDireccion());
    }
}
