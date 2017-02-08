package co.com.techandsolve.codekata.util;

import org.junit.Assert;
import org.junit.Test;

public class NumeroPrimoTest {
	

	@Test
	public void debeSerPrimos(){
		long numero=5;
		Assert.assertTrue(NumeroPrimo.esPrimo(numero));
		
	}

}
