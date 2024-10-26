/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplobuilder2;

/**
 *
 * @author darwi
 */
public class Vehiculo {
    private String puerta;
    private String tipo;
    private String color;
    private boolean aireAcondicionado;
    private boolean navegacionCrucero;

    public Vehiculo(Builder builder) {
        this.puerta = builder.puerta;
        this.tipo = builder.tipo;
        this.color = builder.color;
        this.aireAcondicionado = builder.aireAcondicionado;
        this.navegacionCrucero = builder.navegacionCrucero;
    }
    
    public void info(){
        System.out.println(tipo + " - "  + color + " - "  + puerta);
    }
    
    
}
