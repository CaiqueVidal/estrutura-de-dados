package lista01;

import java.util.Arrays;
import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] vt = new int [100];
		fillVector(vt);		
		
		sortAscendingVector(vt);
		System.out.println("\nVetor classificado em ordem crescente: \n" + Arrays.toString(vt));
	}
	
	
	private static void fillVector(int[] vt) {
		Random r = new Random();
		for(int i = 0; i < vt.length; i++) {
			vt[i] = (r.nextInt(100) * (r.nextInt(2) > 0 ? 1 : -1));
		}
	}

	
	public static void sortAscendingVector(int[] vt) {
		for(int i = 0; i < vt.length; i++) {
			for(int j = i+1; j < vt.length; j++) {
				if (vt[j] < vt[i]) {
					int aux = vt[j];
					vt[j] = vt[i];
					vt[i] = aux;
				}
			}
		}
	}

}
