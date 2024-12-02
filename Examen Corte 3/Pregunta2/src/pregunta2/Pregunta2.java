/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pregunta2;

/**
 *
 * @author darwi
 */
public class Pregunta2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Builder builder = new Builder()
                .setTipoCarne("Molida")
                .setTipoPan("Tajado")
                .setTipoQueso("Costeño")
                .setTipoTomate("Suizo");
        Hamburguesa hambur = builder.build();
        System.out.println(hambur.toString());
    }
    
}
