package co.com.techandsolve.codekata.util;

public class  NumeroPrimo {
	
	private NumeroPrimo(){
		
	}
	
	public static boolean esPrimo(long numero){
		long contador = 2;
		 boolean primo=true;
		 while ((primo) && (contador!=numero)){
			    if (numero % contador == 0)
			      primo = false;
			      
			    contador++;
		} 
		return primo;
	}
	

}
