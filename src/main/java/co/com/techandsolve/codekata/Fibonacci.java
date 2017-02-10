package co.com.techandsolve.codekata;

public class Fibonacci {

	public int sumaParesFibonacci(int numeroMaximo) {
		int serieUno = 1;
		int serieDos = 1;
		int suma = 0;

		while (serieDos < numeroMaximo) {
			serieDos = serieUno + serieDos;
			serieUno = serieDos - serieUno;

			if (serieDos % 2 == 0)
				suma += serieDos;
		}
		return suma;
	}

	public static void main(String[] args) {

		Fibonacci fibonacci = new Fibonacci();

		int suma = fibonacci.sumaParesFibonacci(4000000);

		System.out.println("Suma pares: " + suma);

	}
}
