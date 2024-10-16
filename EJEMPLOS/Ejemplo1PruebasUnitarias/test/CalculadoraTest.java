


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
        
    import ejemplo1pruebasunitarias.Calculadora;
    import org.junit.jupiter.api.Assertions;
    import org.junit.jupiter.api.Test;
/**
 *
 * @author darwi
 */
public class CalculadoraTest {
    @Test
    public void sumarTest(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(10, 5);
        Assertions.assertEquals(15, resultado);
    }
}
