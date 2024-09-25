/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg1.pkg2.kiss;

import java.util.Arrays;

/**
 *
 * @author darwi
 */
public class Numero {
   public int[] numeros;

    public Numero(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return numeros;
    }
   
   
    public static int encontrarMayor(int[] numeros) {
        return Arrays.stream(numeros).max().orElse(Integer.MIN_VALUE);
    }
}
