package co.com.techandsolve.codekata.util;

import org.junit.Assert;
import org.junit.Test;

public class NumeroPrimoTest {
	

	@Test
	public void debeSerPrimos(){
		Assert.assertTrue(NumeroPrimo.esPrimo(57885161));
		//Assert.assertTrue(NumeroPrimo.esPrimo(3));
		//Assert.assertTrue(NumeroPrimo.esPrimo(5));
		//Assert.assertTrue(NumeroPrimo.esPrimo(7));
		//Assert.assertTrue(NumeroPrimo.esPrimo(9));
		
	}
	@Test
	public void noDebeSerPrimos(){
		
		Assert.assertFalse(NumeroPrimo.esPrimo(9));
	}

}
