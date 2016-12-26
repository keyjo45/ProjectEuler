package co.com.techandsolve.codekata;

import org.junit.Assert;
import org.junit.Test;

public class VectorTest {

	
	@Test
	public void debeEncontrarPosicionVectorSegunNumero(){
		
		//arrange
		int[]vectorEnteros= {1,2,3,4,5,6};
		
		Vector vector=new Vector();
		int numeroAEncontrar=3;
		int posicionExperada=2;
		
		//act
		int resultadoObtenido=vector.obtenerNumero(vectorEnteros, numeroAEncontrar);
		
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
		int resultadoObtenido=vector.obtenerNumero(vectorEnteros, numeroAEncontrar);
		
		//assert
		Assert.assertEquals(posicionExperada, resultadoObtenido);
		
	}
	
}
