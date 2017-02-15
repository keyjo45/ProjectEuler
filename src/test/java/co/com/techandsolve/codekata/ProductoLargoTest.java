package co.com.techandsolve.codekata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductoLargoTest {

	private String numero;
	private ProductoLargo producto;

	@Before
	public void setUp() {

		producto = new ProductoLargo();
		numero = "73167176531330624919225119674426574742355349194934"
				+ "96983520312774506326239578318016984801869478851843"
				+ "85861560789112949495459501737958331952853208805511"
				+ "12540698747158523863050715693290963295227443043557"
				+ "66896648950445244523161731856403098711121722383113"
				+ "62229893423380308135336276614282806444486645238749"
				+ "30358907296290491560440772390713810515859307960866"
				+ "70172427121883998797908792274921901699720888093776"
				+ "65727333001053367881220235421809751254540594752243"
				+ "52584907711670556013604839586446706324415722155397"
				+ "53697817977846174064955149290862569321978468622482"
				+ "83972241375657056057490261407972968652414535100474"
				+ "82166370484403199890008895243450658541227588666881"
				+ "16427171479924442928230863465674813919123162824586"
				+ "17866458359124566529476545682848912883142607690042"
				+ "24219022671055626321111109370544217506941658960408"
				+ "07198403850962455444362981230987879927244284909188"
				+ "84580156166097919133875499200524063689912560717606"
				+ "05886116467109405077541002256983155200055935729725"
				+ "71636269561882670428252483600823257530420752963450";
	}

	@Test
	public void debeBuscarProductoLargoCuatroDigitos() {
		int resultado=5832;
		int rango = 4;
		long resultadoObtenido = producto.buscarProductoLargo(producto.convertirNumeroAArreglo(numero), rango);
		Assert.assertEquals(resultado, resultadoObtenido);
	}

	@Test
	public void debeBuscarProductoLargoTreceDigitos() {

		int rango = 13;
		long resultado = producto.buscarProductoLargo(producto.convertirNumeroAArreglo(numero), rango);
		long esperado = 23514624000L;
		Assert.assertEquals(esperado, resultado);
	}

	@Test
	public void debeCalcularProducto() {

		long[] dato = { 9, 9, 8, 9 };
		long resultado = producto.productoArreglo(dato);
		Assert.assertEquals(5832, resultado);
	}

	@Test
	public void debeConvertirNumeroAArreglo() {

		String numero = "256788";
		long[] dato = producto.convertirNumeroAArreglo(numero);

		Assert.assertEquals(2, dato[0]);
		Assert.assertEquals(5, dato[1]);
		Assert.assertEquals(6, dato[2]);
		Assert.assertEquals(7, dato[3]);
		Assert.assertEquals(8, dato[4]);
		Assert.assertEquals(8, dato[5]);
	}
}
