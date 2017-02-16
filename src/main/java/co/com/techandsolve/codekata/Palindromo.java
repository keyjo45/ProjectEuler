package co.com.techandsolve.codekata;

public class Palindromo {

	public int buscarPalidromeMayor() {
		int resultado;
		int numeroMayor = 0;

		for (int numeroUno = 100; numeroUno <= 999; numeroUno++) {
			for (int numeroDos = 100; numeroDos <= 999; numeroDos++) {
				resultado = numeroUno * numeroDos;
				if ((esPalindromo(resultado)) && (resultado > numeroMayor))
					numeroMayor = resultado;
			}
		}
		return numeroMayor;
	}	
	public boolean esPalindromo(int numeroAconvertir){
		return String.valueOf(numeroAconvertir).equals(new StringBuilder(String.valueOf(numeroAconvertir)).reverse().toString());  
	}

	public static void main(String[] args) {
		Palindromo palindromo = new Palindromo();
		int numeroMayor = palindromo.buscarPalidromeMayor();
		System.out.println("el palindrome mayor es: " + numeroMayor);
	}
}
