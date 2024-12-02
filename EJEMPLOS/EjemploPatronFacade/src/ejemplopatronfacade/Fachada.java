/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatronfacade;

/**
 *
 * @author darwi
 */
public class Fachada {
    private SubsistemaDisponibilidad subsitemaDisponibilidad;
    private SubsistemaDePago subsistemaPago;
    private SubsitemaConfirmarPago subsistemaConfirmarPago;
    
    public Fachada(){
        subsitemaDisponibilidad = new SubsistemaDisponibilidad();
        subsistemaPago = new SubsistemaDePago();
        subsistemaConfirmarPago = new SubsitemaConfirmarPago();
    }
    
    public void comprarBoleta(){
        subsistemaConfirmarPago.procesarConfirmacionPago();
        subsistemaPago.procesarPago();
        subsitemaDisponibilidad.procesarDisponibilidad();
    }
}
