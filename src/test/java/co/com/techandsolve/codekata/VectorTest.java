package co.com.techandsolve.codekata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VectorTest {
	
	private Vector vector;
	private int[]vectorEnteros= {1,2,3,4,5,6};
	
	private int primerNumeroAEncontrar=9;
	private int segundoNumeroAEncontrar=2;
	private int posicionExperadaUno=-1;
	private int posicionExperadaDos=1;
	
	@Before
	public void setUp(){
		//arrange
		vector=new Vector();
	
	}

	
	@Test
	public void debeEncontrarPosicionVectorSegunNumero(){
		//act
		int resultadoObtenido=vector.obtenerPosicionMatriz(vectorEnteros, segundoNumeroAEncontrar);
		//assert
		Assert.assertEquals(posicionExperadaDos, resultadoObtenido);
		
	}
	
	@Test
	public void debeRetornarMenosUnoCuandoNoExistaValor(){
			
		//act
		int resultadoObtenido=vector.obtenerPosicionMatriz(vectorEnteros, primerNumeroAEncontrar);
		//assert
		Assert.assertEquals(posicionExperadaUno, resultadoObtenido);
		
	}
	
	@Test
	public void debeRetornarNumeroDePosicionCuandoExistaValorYCuandoNoExista(){
		
		//act
		int resultadoObtenidoUno=vector.obtenerPosicionEnMatriz(vectorEnteros, primerNumeroAEncontrar);
		int resultadoObtenidoDos=vector.obtenerPosicionEnMatriz(vectorEnteros, segundoNumeroAEncontrar);
		
		//assert
		Assert.assertEquals(posicionExperadaUno, resultadoObtenidoUno);
		Assert.assertEquals(posicionExperadaDos, resultadoObtenidoDos);
		
	}
	
}
