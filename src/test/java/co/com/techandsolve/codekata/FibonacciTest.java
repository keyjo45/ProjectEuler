package co.com.techandsolve.codekata;

import org.junit.Assert;
import org.junit.Test;


public class FibonacciTest {
	
	@Test
	public void debeSumarParesFibonacci(){
		int numeroMaximo=4000000;
		
		Fibonacci fibonacci= new Fibonacci();
		
		int suma= fibonacci.sumaParesFibonacci(numeroMaximo);
		
		Assert.assertEquals(4613732, suma);
	}

}
