/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplobuilder2;

/**
 *
 * @author darwi
 */
public class EjemploBuilder2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Builder builder = new Builder()
                .setAireAcondicionado(false)
                .setColor("azul")
                .setNavegacionCrucero(false)
                .setPuerta("10")
                .setTipo("Bus");
        Vehiculo vehiculo = new Vehiculo(builder);
        vehiculo.info();
                            
    }
    
}
