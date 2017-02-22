package co.com.techandsolve.codekata;

public class NumerosTriangulares {

	public long calcularDivisores(int cantidadDivisores) {

		long numero = 0;
		long auxiliar = 1;
		while (true) {
			numero += auxiliar;
			if (cantidadDivisor(numero) > cantidadDivisores)
				break;
			auxiliar++;
		}
		return numero;
	}

	public int cantidadDivisor(long numero) {
		
		int contador = 0;
		for (int j = 1; j <= Math.sqrt(numero); j++)
			if (numero % j == 0)
				contador++;
		contador *= 2;
		return contador;
	}

	public static void main(String[] args) {
		
		NumerosTriangulares numeros = new NumerosTriangulares();
		System.out.println("Cantidad de divisores es: " + numeros.calcularDivisores(500));
	}

}
