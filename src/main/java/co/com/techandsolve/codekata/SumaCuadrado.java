package co.com.techandsolve.codekata;

public class SumaCuadrado {

	public int restarSumaCuadrados(int rango) {

		int suma = 0;
		int sumaInicial = 0;
		for (int i = 1; i <= rango; i++) {
			sumaInicial += i;
			suma += (int) Math.pow(i, 2);
		}
		return ((int) Math.pow(sumaInicial, 2)) - suma;
	}

	public static void main(String[] args) {

		SumaCuadrado sumaCuadrado = new SumaCuadrado();
		int diferencia = sumaCuadrado.restarSumaCuadrados(10);
		System.out.println(diferencia);
	}

}
