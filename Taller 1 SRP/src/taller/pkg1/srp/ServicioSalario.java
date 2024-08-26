/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.srp;

/**
 *
 * @author darwi
 */
public class ServicioSalario {
    public double calcularSalario(Usuario usuario, double precioHora){
        double salario = usuario.getHorasTrabajadas() * precioHora;
        return salario;
    }
}

/** Nueva responsabilidad que se encarga de manejar el salario del usuario, se crea una nueva clase que pertenece al servicio de salario o nomina**/
