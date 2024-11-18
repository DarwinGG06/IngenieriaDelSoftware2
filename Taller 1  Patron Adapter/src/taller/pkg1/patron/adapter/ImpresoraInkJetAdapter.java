/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.patron.adapter;

/**
 *
 * @author darwi
 */
public class ImpresoraInkJetAdapter implements Impresora {
    private ImpresoraInkJet impresoraInkJet;

    public ImpresoraInkJetAdapter(ImpresoraInkJet impresoraInkJet) {
        this.impresoraInkJet = impresoraInkJet;
    }

    @Override
    public void imprimir() {
        impresoraInkJet.imprimirConTinta();
    }
}
