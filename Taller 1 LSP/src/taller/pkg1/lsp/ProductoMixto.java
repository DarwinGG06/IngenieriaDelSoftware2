/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.lsp;

/**
 *
 * @author darwi
 */
public class ProductoMixto extends Producto implements Envio{
    private  double tamanoArchivo;
    private double peso;

    public ProductoMixto(double tamanoArchivo, double peso, String nombre, int precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.tamanoArchivo = tamanoArchivo;
        this.peso = peso;
    }

    @Override
    double costoTotal() {
        return (this.peso * this.getPrecio()) + this.getCantidad() + (tamanoArchivo * this.getPrecio()) + this.getCantidad();
    }  

    @Override
    public void enviarCorreo() {
        System.out.println("Estoy enviando este producto " + this.getNombre() + " por correo");
    }
}
