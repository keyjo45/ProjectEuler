package co.com.techandsolve.codekata;

import java.math.BigInteger;

public class SumaDigitos {
	
	
	public long calcularSumaDePotencia(long base, int exponente){
		long suma=0;
		for(int i=0; i< String.valueOf(BigInteger.valueOf(base).pow(exponente)).length(); i++)
			suma+= Long.parseLong(String.valueOf(String.valueOf(BigInteger.valueOf(base).pow(exponente)).charAt(i)));
		return suma;
	}
	
	public static void main(String[] args) {
	
		SumaDigitos suma=new SumaDigitos();
		long resultado=suma.calcularSumaDePotencia(2,1000);		
		System.out.println(resultado);
	}
}
