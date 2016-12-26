package co.com.techandsolve.codekata;

public class Vector {
	
	public int obtenerNumero(int[] vector, int x){
		int posicion = -1;
		for(int i=0; i<vector.length; i++){
				if(x==vector[i]){
					posicion=i;
				}
			}
		return posicion;
	}
}
