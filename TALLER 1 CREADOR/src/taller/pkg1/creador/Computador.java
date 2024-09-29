/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.creador;

/**
 *
 * @author darwi
 */
public class Computador {
    private String procesador;
    private String TarjetaGrafica;
    private int ram;

    public Computador(String procesador, String TarjetaGrafica, int ram) {
        this.procesador = procesador;
        this.TarjetaGrafica = TarjetaGrafica;
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getTarjetaGrafica() {
        return TarjetaGrafica;
    }

    public int getRam() {
        return ram;
    }
    
}
