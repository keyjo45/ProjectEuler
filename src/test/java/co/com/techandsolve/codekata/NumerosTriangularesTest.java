package co.com.techandsolve.codekata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumerosTriangularesTest {
	
	private NumerosTriangulares numeroTriangular;
	
	@Before
	public void setUp(){
		numeroTriangular=new NumerosTriangulares();
	}
	
	@Test
	public void debeCalcularMasDeCincoDivisoresDeUnNumeroTirangular(){
		
		int cantidadDivisores=5;		
		Assert.assertEquals(28,numeroTriangular.calcularDivisores(cantidadDivisores));
	}
	
	@Test
	public void debeCalcularMasDeQuinientosDivisoresDeUnNumeroTirangular(){
		int cantidadDivisores=500;
		Assert.assertEquals(76576500,numeroTriangular.calcularDivisores(cantidadDivisores));
	}
	
	@Test
	public void debeCalcularCantidadDivisor(){
		int resultadoEsperado = 2;
		int numero = 3;
		Assert.assertEquals(resultadoEsperado, numeroTriangular.cantidadDivisor(numero));

	}
}


