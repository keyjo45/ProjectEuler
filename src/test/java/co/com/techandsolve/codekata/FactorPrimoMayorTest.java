package co.com.techandsolve.codekata;

import org.junit.Assert;
import org.junit.Test;


public class FactorPrimoMayorTest {
	
	
	@Test
	public void debeEncontrarFactorPrimoMayor(){
		long numero=6;
		FactoresPrimos factor=new FactoresPrimos();
		long resultado=factor.factorPrimo(numero);
		
		Assert.assertEquals(3, resultado);
		
	}

}
