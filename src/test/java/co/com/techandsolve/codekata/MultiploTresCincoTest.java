package co.com.techandsolve.codekata;

import org.junit.Assert;
import org.junit.Test;

public class MultiploTresCincoTest {

	@Test
	public void debeSumarMultiploDeTresYCinco() {

		Multiplo multiplo = new Multiplo();
		int sumaMultiplo = multiplo.sumaMultipoTresCinco();
		Assert.assertEquals(233168, sumaMultiplo);
	}

}
