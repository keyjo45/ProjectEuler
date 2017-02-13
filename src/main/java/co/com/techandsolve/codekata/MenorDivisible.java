package co.com.techandsolve.codekata;

public class MenorDivisible {
	public int consultarMenorNumeroDivisible(int rango) {

		int numero = 11;
		while (true) {
			for (int i = 1; i <= rango; i++) {

				if (0 != numero % i) {
					i = rango + 1;
				} else if (i == rango) {
					return numero;
				}
			}
			numero++;
		}
	}

	public static void main(String[] args) {

		MenorDivisible menor = new MenorDivisible();
		int numero = menor.consultarMenorNumeroDivisible(20);
		System.out.println("El numero menor divisible entre 1 y 20 es: " + numero);
	}
}
