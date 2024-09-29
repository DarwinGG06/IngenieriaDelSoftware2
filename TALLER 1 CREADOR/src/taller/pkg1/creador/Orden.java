/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.creador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author darwi
 */
public class Orden {
    private List<Computador> computadores = new ArrayList<>();
    private CrearComputador crear = new CrearComputador();
    
    public void crearComputador(String procesador, String tarjetaGrafica, int ram){
        Computador computador = crear.crearCompu("dsfdsfdsf", "dsfsdff", 234234234);
        computadores.add(computador);
    }

    public List<Computador> getComputadores() {
        return computadores;
    }

    public CrearComputador getCrear() {
        return crear;
    }
    
    
    
}