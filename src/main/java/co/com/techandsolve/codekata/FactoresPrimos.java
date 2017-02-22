package co.com.techandsolve.codekata;

public class FactoresPrimos {

	public long factorPrimo(long numero) {
		long factor = 2;
		long numeroMayor = 0;

		if (numero > 1) {
			while (factor <= numero) {
				if (numero % factor == 0) {
					numeroMayor = factor;
					numero /= factor;
				} else {
					factor++;
				}
			}
		}

		return numeroMayor;
	}

	public static void main(String[] args) {

		long numero = 600851475143L;

		FactoresPrimos factores = new FactoresPrimos();

		System.out.println(factores.factorPrimo(numero));

	}

}
