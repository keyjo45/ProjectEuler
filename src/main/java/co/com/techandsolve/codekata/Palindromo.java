package co.com.techandsolve.codekata;

public class Palindromo {

	public int buscarPalidromeMayor() {
		int resultado;
		int numeroMayor = 0;

		for (int numeroUno = 100; numeroUno <= 999; numeroUno++) {
			for (int numeroDos = 100; numeroDos <= 999; numeroDos++) {
				resultado = numeroUno * numeroDos;

				if (esPalindromo(resultado))
					if (resultado > numeroMayor)
						numeroMayor = resultado;
			}
		}
		return numeroMayor;
	}

	public boolean esPalindromo(int numero) {

		boolean palindromo = true;
		int numeroInvertido = 0;
		int divisionEntera = numero;
		int restante;

		while (divisionEntera != 0) {
			restante = divisionEntera % 10;
			divisionEntera = divisionEntera / 10;
			numeroInvertido = numeroInvertido * 10 + restante;
		}

		if (numero != numeroInvertido)
			palindromo = false;

		return palindromo;
	}

	public static void main(String[] args) {

		Palindromo palindromo = new Palindromo();
		int numeroMayor = palindromo.buscarPalidromeMayor();
		System.out.println("el palindrome mayor es: " + numeroMayor);

	}
}
