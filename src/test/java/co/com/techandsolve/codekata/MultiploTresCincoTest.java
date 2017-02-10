package co.com.techandsolve.codekata;

import org.junit.Assert;
import org.junit.Test;

public class MultiploTresCincoTest {
	
	@Test
	public void debeSumarMultiploDeTresYCincoPorDebajoDiez() {

		Multiplo multiplo = new Multiplo();
		int sumaMultiplo = multiplo.sumaMultipoTresCinco(10);
		Assert.assertEquals(23, sumaMultiplo);
	}

	@Test
	public void debeSumarMultiploDeTresYCinco() {

		Multiplo multiplo = new Multiplo();
		int sumaMultiplo = multiplo.sumaMultipoTresCinco(1000);
		Assert.assertEquals(233168, sumaMultiplo);
	}

}
