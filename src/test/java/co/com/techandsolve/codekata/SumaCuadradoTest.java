package co.com.techandsolve.codekata;

import org.junit.Assert;
import org.junit.Test;


public class SumaCuadradoTest {
	
	@Test
	public void debeObtenerDiferenciaSumarCuadradosDeDiez(){
		
		SumaCuadrado sumaCuadrado= new SumaCuadrado();
		
		int diferencia=sumaCuadrado.restarSumaCuadrados(10);
		
		Assert.assertEquals(2640, diferencia);
	}
	
	@Test
	public void debeObtenerDiferenciaSumarCuadradosDeCien(){
		
		SumaCuadrado sumaCuadrado= new SumaCuadrado();
		
		int diferencia=sumaCuadrado.restarSumaCuadrados(100);
		
		Assert.assertEquals(25164150, diferencia);
	}
	
	
}
