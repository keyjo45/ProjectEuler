package co.com.techandsolve.codekata;

import co.com.techandsolve.codekata.util.NumeroPrimo;

public class SumaPrimos {
	
	public long sumarPrimos(long numero){
		long i=2; 
		long suma=0;
		
		while(i<=numero){
			 	if(NumeroPrimo.esPrimo(i))
					 suma+=i; 
			i++;
		}
		 
		return suma;
	}
	
	public static void main(String[] args) {
		
		SumaPrimos sumaPrimos=new SumaPrimos();
		
		
		long suma=sumaPrimos.sumarPrimos(2000000);
		
		System.out.println("La suma es: "+suma);
		
	}

}
