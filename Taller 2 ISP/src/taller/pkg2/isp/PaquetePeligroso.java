/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg2.isp;

/**
 *
 * @author darwi
 */
public class PaquetePeligroso extends Paquete implements PaquetePeligrosoInter {
    private String ePeligro;
    private boolean emEspecial;

    public PaquetePeligroso(String ePeligro, boolean emEspecial, double peso, String dimensiones) {
        super(peso, dimensiones);
        this.ePeligro = ePeligro;
        this.emEspecial = emEspecial;
    }

    public String getePeligro() {
        return ePeligro;
    }

    public boolean getEmEspecial() {
        return emEspecial;
    }

    

    @Override
    public void verificarContenidoPeligroso() {
        System.out.println("Se verifica el contenido si es peligroso o no");
    }

    @Override
    public void asegurarPaquetePeligroso() {
        System.out.println("Si el contenido es peligroso se asegura el paquete");
    }
    
    
}
