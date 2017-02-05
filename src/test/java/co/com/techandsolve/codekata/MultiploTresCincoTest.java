package co.com.techandsolve.codekata;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;



public class MultiploTresCincoTest {
	
	@Test
	public void debeSumarMultiploDeTresYCinco(){
		
		//arrange
		Multiplo multiplo=new Multiplo();
		List<Integer> listaNumeros=new ArrayList<Integer>();
		
		//act
		for(int i=1; i<1000; i++)
			listaNumeros.add(i);
		int sumaMultiplo=multiplo.sumaMultipoTresCinco(listaNumeros);
		
		
		//assert
		Assert.assertEquals(233168, sumaMultiplo);
		
	}

}
