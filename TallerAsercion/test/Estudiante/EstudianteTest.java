package Estudiante;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class EstudianteTest {
	
	private static Estudiante estudiante;

	@BeforeAll
    static void initAll() {
        
        estudiante = new Estudiante("Darwin", 20);
    }
	
	@Test
    void agregarCalificacionTest() {
        estudiante.agregarCalificaciones(8.5);
        assertEquals(1, estudiante.getnNumeroCalificaciones());
    }
	
	void obtenerPromedioTest() {
        estudiante.agregarCalificaciones(8.0);
        estudiante.agregarCalificaciones(9.0);
        assertEquals(8.5, estudiante.obtenerPromedio());
    }
	
	@Test
    void getNumeroCalificacionesTest() {
        estudiante.agregarCalificaciones(6.0);
        estudiante.agregarCalificaciones(7.5);
        assertEquals(2, estudiante.getnNumeroCalificaciones());
    }
	
	@Test
    void agregarCalificacionInvalidaTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            estudiante.agregarCalificaciones(11.0);
        });
        assertEquals("La calificacion debe estar entre 0 y 10", exception.getMessage());
    }
	
	@AfterAll
    static void afterAll() {
		System.out.println("Finalizar pruebas Unitarias");
    }

}
