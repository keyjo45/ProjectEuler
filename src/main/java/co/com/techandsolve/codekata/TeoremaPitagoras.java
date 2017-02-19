package co.com.techandsolve.codekata;

public class TeoremaPitagoras {

	public long productoPitagoras(int rango) {

		long resultado = 0;
		long a = 1;
		long b;
		while (a < rango) {
			b = a;
			while (b < rango) {
				long c = rango - b - a;
				if (encontrarTeoremaPitagoras(a, b, c)) {
					resultado = a * b * c;
					break;
				}
				b++;
			}
			a++;
		}
		return resultado;
	}

	public boolean encontrarTeoremaPitagoras(long a, long b, long c) {
		return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
	}

	public static void main(String[] args) {
		TeoremaPitagoras teoremaPitagoras = new TeoremaPitagoras();
		System.out.println(teoremaPitagoras.productoPitagoras(1000));
	}

}
