package co.com.techandsolve.codekata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class PalindromoTest {
	
	private Palindromo palindromo;
	
	@Before
	public void setUp(){
		palindromo=new Palindromo();
	}
	
	@Test
	public void debeSerPalindrome(){
		int numero=802208;
		Assert.assertTrue(palindromo.esPalindromo(numero));
	}
	

	@Test
	public void noEsPalindrome(){
		int numero=342208;
		Assert.assertFalse(palindromo.esPalindromo(numero));
	}
	
	@Test
	public void debeBuscarPalindromeMayorDeTresDigitos(){
		int resultado=906609;
		int palidromeResultante=palindromo.buscarPalidromeMayor();
		
		Assert.assertEquals(resultado, palidromeResultante);
		
	}

}
