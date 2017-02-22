package co.com.techandsolve.codekata;

import org.junit.Assert;
import org.junit.Test;

public class SumaDigitoTest {
	
	@Test
	public void debecalcularSumaDePotencia(){
	
		SumaDigitos sumaDigitos=new SumaDigitos();
		Assert.assertEquals(26, sumaDigitos.calcularSumaDePotencia(2,15));
		Assert.assertEquals(1366, sumaDigitos.calcularSumaDePotencia(2,1000));
	}
}