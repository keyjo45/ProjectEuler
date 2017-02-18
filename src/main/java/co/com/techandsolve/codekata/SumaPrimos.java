package co.com.techandsolve.codekata;

import java.util.stream.LongStream;

import co.com.techandsolve.codekata.util.NumeroPrimo;

public class SumaPrimos {

	public long sumarPrimos(long numero) {
		return LongStream.range(2, numero).filter(n -> NumeroPrimo.esPrimo(n)).sum();
	}

	public static void main(String[] args) {

		SumaPrimos sumaPrimos = new SumaPrimos();
		long suma = sumaPrimos.sumarPrimos(2000000);
		System.out.println("La suma es: " + suma);
	}

}
