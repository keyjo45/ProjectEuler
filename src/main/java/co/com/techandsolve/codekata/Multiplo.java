package co.com.techandsolve.codekata;

import java.util.ArrayList;
import java.util.List;

public class Multiplo {
	
	
	public int sumaMultipoTresCinco(List<Integer> listaNumeros){
		return listaNumeros.stream().filter(i->(i % 3==0)||(i % 5 ==0)).mapToInt(i->i.intValue()).sum();
		
	}
	
	public static void main(String[] args) {
		List<Integer> listaNumeros=new ArrayList<>();
		for(int i=1; i<1000; i++)
			listaNumeros.add(i);
		Multiplo multiplo=new Multiplo();
		
		int suma=multiplo.sumaMultipoTresCinco(listaNumeros);
		 System.out.println(suma);
		
	}

}
