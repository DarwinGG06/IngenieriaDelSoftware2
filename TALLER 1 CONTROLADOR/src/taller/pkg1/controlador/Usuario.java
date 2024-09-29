/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.controlador;

/**
 *
 * @author darwi
 */
public class Usuario {
    private ControladorVenta controlar = new ControladorVenta();
    public void comprar(String tipo){
        controlar.comprarEntrada(tipo);
    }
}
