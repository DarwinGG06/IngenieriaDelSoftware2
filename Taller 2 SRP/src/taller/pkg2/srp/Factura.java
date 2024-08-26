/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg2.srp;

/**
 *
 * @author darwi
 */
public class Factura {
    public double codigo;
    public String porducto;
    public int cantidad;
    public int valorTotal;

    public Factura(double codigo, String porducto, int cantidad, int valorTotal) {
        this.codigo = codigo;
        this.porducto = porducto;
        this.cantidad = cantidad;
        this.valorTotal = valorTotal;
    }

    public double getCodigo() {
        return codigo;
    }

    public String getPorducto() {
        return porducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getValorTotal() {
        return valorTotal;
    }
    
    
    
}
