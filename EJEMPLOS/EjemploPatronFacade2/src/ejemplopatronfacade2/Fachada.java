/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatronfacade2;

/**
 *
 * @author darwi
 */
public class Fachada {
    private SubsistemaCita subsitemaCita;
    private SubsistemaExamenes subsistemaExamanen;
    private SubsistemaMedicamentos subsistemaMedicamentos;
    
    public Fachada(){
        subsitemaCita = new SubsistemaCita();
        subsistemaExamanen = new SubsistemaExamenes();
        subsistemaMedicamentos = new SubsistemaMedicamentos();
    }
    
    public void Tratamiento(){
       subsitemaCita.asistirCita();
       subsistemaExamanen.asistirExamentes();
       subsistemaMedicamentos.aplicarMedicamentos();
    }
}
