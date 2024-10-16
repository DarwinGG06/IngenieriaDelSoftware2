package Calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

class calculadoraTest {
	 static Calculadora calculadora;
		
		@BeforeAll
	    static void setup() {
	        calculadora = new Calculadora();
	    }

	    @Test
	    void testSuma() {
	        assertEquals(5, calculadora.sumar(2, 3));
	        assertNotEquals(6, calculadora.sumar(2, 3));
	    }

	    @Test
	    void testResta() {
	        assertEquals(1, calculadora.restar(3, 2));
	        assertFalse(calculadora.restar(3, 2) == 0);
	    }

	    @Test
	    void testMultiplicacion() {
	        assertEquals(6, calculadora.multiplicar(2, 3));
	        assertTrue(calculadora.multiplicar(2, 3) == 6);
	    }

	    @Test
	    void testDivision() {
	        assertEquals(2.0, calculadora.dividir(4, 2));
	    }

	    @RepeatedTest(5)
	    void testSumaRepetida() {
	        assertEquals(5, calculadora.sumar(2, 3));
	    
	}

}
