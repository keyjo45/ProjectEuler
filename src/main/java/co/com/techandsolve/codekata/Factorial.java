package co.com.techandsolve.codekata;

import java.math.BigInteger;

public class Factorial {
	
	private BigInteger auxiliar,multiplicacion;
	
	public int calculaProductoFactorial(int numero) {
		
		multiplicacion=calcularFactorial(numero);
		int suma=0;
		for(int j=0; j<multiplicacion.toString().length(); j++)
			suma+=Integer.parseInt(String.valueOf(multiplicacion.toString().charAt(j)));
		return suma;
	}
	
	public BigInteger calcularFactorial(int numero){
		
		multiplicacion = BigInteger.valueOf(1);
				
		for (int i = 1; i <=numero; i++){
			auxiliar=BigInteger.valueOf(i);
			multiplicacion = multiplicacion.multiply(auxiliar);
		}
		
		return multiplicacion;	
	}
	
	public static void main(String[] args) {
		
		Factorial factorial=new Factorial();
		System.out.println("El producto del factorial es: "+factorial.calculaProductoFactorial(100));
	}

}
