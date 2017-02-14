package co.com.techandsolve.codekata;

import co.com.techandsolve.codekata.util.NumeroPrimo;

public class PosicionPrimo {
	
	public int calcularPrimoPosicion(int posicion){
		int i=2;
		int posicionObtenida=0;
		while(true){
			
			if(NumeroPrimo.esPrimo(i)){
				posicionObtenida+=1;
			}
			if(posicionObtenida==posicion){
				break;
			}
			i++;	
		}
		return i;
	}
	
	public static void main(String[] args) {
		
		PosicionPrimo posicion=new PosicionPrimo();
		
		int posicionObtenida=posicion.calcularPrimoPosicion(10001);
		
		System.out.println("El numero primo es : "+posicionObtenida);
		
	}
}
