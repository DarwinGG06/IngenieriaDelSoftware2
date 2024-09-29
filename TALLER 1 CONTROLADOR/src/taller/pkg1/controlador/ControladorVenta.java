/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author darwi
 */
public class ControladorVenta {
    private List<Entrada> entradas = new ArrayList();

    public ControladorVenta() {
        entradas.add(new Entrada("vip", 234234, true));
        entradas.add(new Entrada("estandar", 234234, false));
        // Todo tipo de entradas
    }
    
    
    public void comprarEntrada(String tipo){
        Entrada entrada = encontrarEntrada(tipo);
        
        if (entrada == null){
            System.out.println("No existe");
            return;
        }
        
        if(entrada.isDisponible()){
            entrada.setDisponible(false);
            
            System.out.println("Entrada Comprada");
        } else {
            System.out.println("Entrada no disponible");
        }
    }
     private Entrada encontrarEntrada(String tipo) {
        for (Entrada entrada : entradas) {
            if (entrada.getTipo().equalsIgnoreCase(tipo)) {
                return entrada;
            }
        }
        return null;
    }
}
