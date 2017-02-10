package co.com.techandsolve.codekata;

import java.util.stream.IntStream;

public class Multiplo {

	public int sumaMultipoTresCinco(int rango) {
		return IntStream.range(1,rango).filter(i -> (i % 3 == 0) || (i % 5 == 0)).sum();
	}

	public static void main(String[] args) {

		Multiplo multiplo = new Multiplo();

		int suma = multiplo.sumaMultipoTresCinco(1000);
		System.out.println(suma);

	}
}
