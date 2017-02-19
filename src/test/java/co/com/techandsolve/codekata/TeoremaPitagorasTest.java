package co.com.techandsolve.codekata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TeoremaPitagorasTest {

	TeoremaPitagoras teorema;

	@Before
	public void setUp() {
		teorema = new TeoremaPitagoras();
	}

	@Test
	public void debeEncontrarTeoremaPitagoras() {

		long a = 3;
		long b = 4;
		long c = 5;

		Assert.assertTrue(teorema.encontrarTeoremaPitagoras(a, b, c));
	}

	@Test
	public void noDebeEncontrarTeorema() {

		long a = 3;
		long b = 4;
		long c = 9;

		Assert.assertFalse(teorema.encontrarTeoremaPitagoras(a, b, c));
	}

	@Test
	public void debeEncontrarProductoRangoDoce() {

		long resultado = 60;
		int rango=12;
		Assert.assertEquals(resultado, teorema.productoPitagoras(rango));

	}

	@Test
	public void debeEncontrarProductoRangoMil() {
		long resultado = 31875000;
		int rango=1000;
		Assert.assertEquals(resultado, teorema.productoPitagoras(rango));

	}
}
