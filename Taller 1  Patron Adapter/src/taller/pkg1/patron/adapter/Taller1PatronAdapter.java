/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1.patron.adapter;

/**
 *
 * @author darwi
 */
public class Taller1PatronAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ImpresoraLaser impresoraL = new ImpresoraLaser();
        ImpresoraInkJet impresoraT = new ImpresoraInkJet();
        
        Impresora impresionL = new ImpresoraLaserAdapter(impresoraL);
        Impresora impresionT = new ImpresoraInkJetAdapter(impresoraT);
        
        impresionL.imprimir();
        impresionT.imprimir();
    }
    
}
