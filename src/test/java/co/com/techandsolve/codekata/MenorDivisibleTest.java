package co.com.techandsolve.codekata;

import org.junit.Assert;
import org.junit.Test;

public class MenorDivisibleTest {

	@Test
	public void debeEncontrarMenorDivisibleEntreUnoYDiez() {

		MenorDivisible menor = new MenorDivisible();
		int numero = menor.consultarMenorNumeroDivisible(10);
		Assert.assertEquals(2520, numero);
	}

	@Test
	public void debeEncontrarMenorDivisibleEntreUnoYVeinte() {

		MenorDivisible menor = new MenorDivisible();
		int numero = menor.consultarMenorNumeroDivisible(20);
		Assert.assertEquals(232792560, numero);
	}
}
