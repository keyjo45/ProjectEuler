package co.com.techandsolve.codekata;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Vector {
	
	public int obtenerPosicionMatriz(int[] vector, int x){
		int posicion = -1;
		for(int i=0; i<vector.length; i++){
				if(x==vector[i]){
					posicion=i;
				}
			}
		return posicion;
	}
	
	
	public int obtenerPosicionEnMatriz(int[] vector, int numeroABuscar) {
		
		return Arrays.stream(vector).map(indice->IntStream.range(0,vector.length)
				.filter(j->numeroABuscar==vector[j]).findFirst().orElse(-1)).findAny().getAsInt();
	}	
	
}
