/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

/**
 *
 * @author darwi
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Suma: " + calculadora.sumar(10, 5));
        System.out.println("Resta: " + calculadora.restar(10, 5));
        System.out.println("Multiplicacion: " + calculadora.multiplicar(10, 5));
        System.out.println("Division: " + calculadora.dividir(10, 5));
        System.out.println("Division: " + calculadora.dividir(10, 0));

	}
    }
    

