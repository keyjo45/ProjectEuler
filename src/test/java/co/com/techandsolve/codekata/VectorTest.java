package co.com.techandsolve.codekata;

import org.junit.Assert;
import org.junit.Test;

public class VectorTest {

	
	@Test
	public void debeEncontrarPosicionVectorSegunNumero(){
		
		//arrange
		int[]vectorEnteros= {1,2,3,4,5,6};
		Vector vector=new Vector();
		int numeroAEncontrar=1;
		int posicionExperada=0;
		
		//act
		int resultadoObtenido=vector.obtenerPosicionMatriz(vectorEnteros, numeroAEncontrar);
		
		//assert
		Assert.assertEquals(posicionExperada, resultadoObtenido);
		
	}
	
	@Test
	public void debeRetornarMenosUnoCuandoNoExistaValor(){
		
		//arrange
		int[]vectorEnteros= {1,2,3,4};
		Vector vector=new Vector();
		int numeroAEncontrar=9;
		int posicionExperada=-1;
		
		//act
		int resultadoObtenido=vector.obtenerPosicionMatriz(vectorEnteros, numeroAEncontrar);
		
		//assert
		Assert.assertEquals(posicionExperada, resultadoObtenido);
		
	}
	
	@Test
	public void debeRetornarNumeroDePosicionCuandoExistaValorYCuandoNoExista(){
		
		//arrange
		int[]vectorEnteros= {1,2,3,4};
		Vector vector=new Vector();
		int primerNumeroAEncontrar=9;
		int segundoNumeroAEncontrar=2;
		int posicionExperadaUno=-1;
		int posicionExperadaDos=1;
		
		//act
		int resultadoObtenidoUno=vector.obtenerPosicionEnVector(vectorEnteros, primerNumeroAEncontrar);
		int resultadoObtenidoDos=vector.obtenerPosicionEnVector(vectorEnteros, segundoNumeroAEncontrar);
		
		//assert
		Assert.assertEquals(posicionExperadaUno, resultadoObtenidoUno);
		Assert.assertEquals(posicionExperadaDos, resultadoObtenidoDos);
		
	}
	
}
