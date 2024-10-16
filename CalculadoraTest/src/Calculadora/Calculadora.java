package Calculadora;

public class Calculadora {
	public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("No se puede dividir entre 0");
            return Double.NaN;
        }
        return (double) a / b;
    }
}
