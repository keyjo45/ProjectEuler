package co.com.techandsolve.codekata;

import org.junit.Assert;
import org.junit.Test;



public class SumaPrimosTest {
	
	
	@Test
	public void debeSumarPrimosDebajoDiez(){
		long numero = 10;
		SumaPrimos sumaPrimos = new SumaPrimos();

		long suma = sumaPrimos.sumarPrimos(numero);
		Assert.assertEquals(17, suma);
	}
	
	@Test
	public void debeSumarPrimosDebajoDosMillones(){
		long numero = 2000000;
		SumaPrimos sumaPrimos = new SumaPrimos();

		long suma = sumaPrimos.sumarPrimos(numero);
		Assert.assertEquals(142913828922L, suma);
	}
}
