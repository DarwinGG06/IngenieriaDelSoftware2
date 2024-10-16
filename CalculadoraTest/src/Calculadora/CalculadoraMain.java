package Calculadora;

public class CalculadoraMain {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

        System.out.println("Suma: " + calculadora.sumar(10, 5));
        System.out.println("Resta: " + calculadora.restar(10, 5));
        System.out.println("Multiplicacion: " + calculadora.multiplicar(10, 5));
        System.out.println("Division: " + calculadora.dividir(10, 5));
        System.out.println("Division: " + calculadora.dividir(10, 0));
	}

}
