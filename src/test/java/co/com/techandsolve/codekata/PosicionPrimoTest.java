package co.com.techandsolve.codekata;

import org.junit.Assert;
import org.junit.Test;

public class PosicionPrimoTest {
	
	@Test
	public void debeCalcularPrimoSextaPosicion(){
		PosicionPrimo posicion=new PosicionPrimo();
		
		int posicionNumero=posicion.calcularPrimoPosicion(6);
		Assert.assertEquals(13, posicionNumero);
		
	}
	
	@Test
	public void debeCalcularPrimoSextaPosicionDiezMil(){
		PosicionPrimo posicion=new PosicionPrimo();
		
		int posicionNumero=posicion.calcularPrimoPosicion(10001);
		Assert.assertEquals(104743, posicionNumero);
		
	}

}
