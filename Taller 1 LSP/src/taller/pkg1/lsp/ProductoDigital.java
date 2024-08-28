/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.lsp;

/**
 *
 * @author darwi
 */
public class ProductoDigital extends Producto {
    private  double tamanoArchivo;

    public ProductoDigital(double tamanoArchivo, String nombre, int precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.tamanoArchivo = tamanoArchivo;
    }

    @Override
    double costoTotal() {
        return (tamanoArchivo * this.getPrecio()) + this.getCantidad();
    } 
}
