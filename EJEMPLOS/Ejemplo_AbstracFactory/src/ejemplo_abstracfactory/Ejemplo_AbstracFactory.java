/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_abstracfactory;

/**
 *
 * @author darwi
 */
public class Ejemplo_AbstracFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        Fabrica fabricaM = new FabricaMac();
        Fabrica fabricaW = new FabricaWindows();
        
        CuadroTexto cuadroMac = fabricaM.cuadroTexto();
        CuadroTexto cuadroWin = fabricaW.cuadroTexto();
        
        cuadroMac.renderizarCuadro();
        cuadroWin.renderizarCuadro();

    }
    
}
