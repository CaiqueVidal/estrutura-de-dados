package lista01;

import java.util.Arrays;
import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] vt = new int[5];
		fillVector(vt);
		
		int size = vt.length;
		int[] vtFactorial = new int[size];
		factorialVector(vt, vtFactorial); 
		
		System.out.println("Vetor de inteiros: \n" + Arrays.toString(vt));
		System.out.println("\nVetor com seus fatoriais: \n" + Arrays.toString(vtFactorial));
	}
	
	
	private static void fillVector(int[] vt) {
		Random r = new Random();
		for (int i = 0; i < vt.length; i++) {
			vt[i] = r.nextInt(10);
		}

	}

	
	private static void factorialVector(int[] vt, int[] vtFactorial) {
		for (int i = 0; i < vt.length; i++) {
			vtFactorial[i] = calculateFactorial(vt[i]);
		}	
	}
	
	
	private static int calculateFactorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact *= i;
		}
		return fact;
	}
	
}
