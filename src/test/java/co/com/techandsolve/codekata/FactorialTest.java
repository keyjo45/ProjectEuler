package co.com.techandsolve.codekata;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
	
	@Test
	public void debeCalcularFactorial(){
		Factorial factorial=new Factorial();
		
		Assert.assertEquals(120, factorial.calcularFactorial(5).longValue());
		Assert.assertEquals(2432902008176640000L, factorial.calcularFactorial(20).longValue());
	}
	
	
	@Test
	public void debeCalcularProductoFactorial(){
		Factorial factorial=new Factorial();
		
		Assert.assertEquals(27, factorial.calculaProductoFactorial(10));
		Assert.assertEquals(648, factorial.calculaProductoFactorial(100));
	}

}
