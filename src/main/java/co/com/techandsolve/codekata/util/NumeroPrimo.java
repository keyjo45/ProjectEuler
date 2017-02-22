package co.com.techandsolve.codekata.util;

public class NumeroPrimo {

	private NumeroPrimo() {

	}

	public static boolean esPrimo(long numero){
		boolean primo = true;
		if(numero==2){
			primo=true;
		}else{
			long contador = 2;
			while ((primo)&&(contador <= Math.ceil(Math.sqrt(numero)))){
				if (numero % contador == 0){
					primo = false;
				}
				contador++;
			}
		}
		return primo;
	}	
}
